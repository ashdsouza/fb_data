package fb_data_client;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;

public class FbDataExtractor {
	
	private String accessToken;
	private String pageToken;
	private FacebookClient fbClient;
	
	public FbDataExtractor() {
		//got from https://developers.facebook.com/tools/explorer
		this.accessToken = "CAACEdEose0cBAHfNwZCuZB3UXFCKrfnGsr0ROmMJY5dLSZAcNQvKBB6LYtBL7jY0nrFFWFW6gd566oYW09eDKGbCJOD4xFIDq2w58ZCp0e0dUKle3xnyp36mE0aXUyIKfVraI9ktEsK3EAXR74Ikp9bHIN73lyZAldjNYGCeDjuhRlWX6DjZCo3lnFvRzZC5b35QVHrZCgZACoITlIK0CoyO8axBoY7ouPNUZD";
		this.pageToken = "CAACEdEose0cBAA8589mYl9iYebVae5kLTR2WAFZCJPbTkj37xFBZB58Qj4fiIYV3E2uihBXniOyZCHQr7JpXBwZBy9Jrs1G5hRkvT0MFcXxs7OmQilxahfBENEoZBR4fyLrA636hyShnUazmZCr62VZCiUY5juG88xmTwy5unF2ylQ4dZCvZBA1i69jNDr2wng30orrWjJnYapmI8P3EjzrjnZBUJ1kPViZBucZD";
		fbClient = new DefaultFacebookClient(this.accessToken);
	}
	
	
}
