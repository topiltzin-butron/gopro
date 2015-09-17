package org.topiltzin.shibumi.gopro.client.impl;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.topiltzin.shibumi.gopro.dto.Command;
import org.topiltzin.shibumi.gopro.dto.GoProCamera;
import org.topiltzin.shibumi.gopro.exception.GoProException;

public abstract class AbstractBaseClient {

	protected void executeCommand(GoProCamera goProCamera, Command command)
			throws GoProException {
		if (goProCamera != null && command != null) {
			
			final CommandBuilder commandBuilder = new CommandBuilder(
					goProCamera, command);
			String commandToExecute = commandBuilder.build();
			executeCommand(commandToExecute);
		}
	}

	public void executeCommandDummy(String command) throws GoProException {
		executeCommand(command);
	}
	
	protected void executeCommand(String command) throws GoProException {

		HttpClient httpClient = new DefaultHttpClient();

		try {
			HttpGet httpGet = new HttpGet(command);
			System.out
					.println("Executing request: " + httpGet.getRequestLine());

			// Create a custom response handler
			ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

				@Override
				public String handleResponse(final HttpResponse response)
						throws ClientProtocolException, IOException {
					int status = response.getStatusLine().getStatusCode();
					String responseBody = null;
					if (status >= 200 && status < 300) {
						HttpEntity entity = response.getEntity();
						

						InputStream is = entity.getContent();
						DataInputStream dis = new DataInputStream(is);
						System.out.println("8888");
						System.out.println(dis);
						
						responseBody = entity != null ? EntityUtils
								.toString(entity) : null;
					} else if (status == 403) {
						throw new ClientProtocolException(
								"Password is incorrect");
					} else {
						throw new ClientProtocolException(
								"Unexpected response status: " + status);
					}
					return responseBody;
				};
			};

			String responseBody = null;
			try {
				responseBody = httpClient.execute(httpGet, responseHandler);
			} catch (IOException e) {
				throw new GoProException("Unable to connect to GoPro camera", e);
			}
			System.out.println("----------------------------------------");
			System.out.println(responseBody);

		} finally {
			// httpClient.close();
		}
	}

}
