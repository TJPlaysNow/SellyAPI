package com.tjplaysnow.sellyapi;

import com.google.gson.Gson;
import com.tjplaysnow.sellyapi.resources.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Objects;

public class Selly {
	
	private String encode;
	private Gson gson;
	
	public Selly(String email, String apiKey) {
		encode = Base64.getEncoder().encodeToString((email + ":" + apiKey).getBytes());
		gson = new Gson();
	}
	
	public List<Coupon> getCoupons() throws NullPointerException, IOException, InterruptedException, URISyntaxException{
		HttpResponse<String> response = getResponse("coupons");
		String json = response.body();
		System.out.println(json);
		if (Objects.equals(json, "{\"message\":\"You have reached the request limit\"}")) {
			return null;
		}
		return Arrays.asList(gson.fromJson(json, Coupon[].class));
	}
	
	public List<Order> getOrders() throws NullPointerException, IOException, InterruptedException, URISyntaxException{
		HttpResponse<String> response = getResponse("orders");
		String json = response.body();
		System.out.println(json);
		if (Objects.equals(json, "{\"message\":\"You have reached the request limit\"}")) {
			return null;
		}
		return Arrays.asList(gson.fromJson(json, Order[].class));
	}
	
	public Order getOrder(String id) throws NullPointerException, IOException, InterruptedException, URISyntaxException {
		HttpResponse<String> response = getResponse("orders/" + id);
		String json = response.body();
		System.out.println(json);
		if (Objects.equals(json, "{\"message\":\"You have reached the request limit\"}")) {
			return null;
		}
		return gson.fromJson(json, Order.class);
	}
	
	public List<Product> getProducts() throws NullPointerException, IOException, InterruptedException, URISyntaxException{
		HttpResponse<String> response = getResponse("products");
		String json = response.body();
		System.out.println(json);
		if (Objects.equals(json, "{\"message\":\"You have reached the request limit\"}")) {
			return null;
		}
		return Arrays.asList(gson.fromJson(json, Product[].class));
	}
	
	public Product getProduct(String id) throws NullPointerException, IOException, InterruptedException, URISyntaxException{
		HttpResponse<String> response = getResponse("products/" + id);
		String json = response.body();
		System.out.println(json);
		if (Objects.equals(json, "{\"message\":\"You have reached the request limit\"}")) {
			return null;
		}
		return gson.fromJson(json, Product.class);
	}
	
	public List<ProductGroup> getProductGroups() throws NullPointerException, IOException, InterruptedException, URISyntaxException{
		HttpResponse<String> response = getResponse("product_groups");
		String json = response.body();
		System.out.println(json);
		if (Objects.equals(json, "{\"message\":\"You have reached the request limit\"}")) {
			return null;
		}
		return Arrays.asList(gson.fromJson(json, ProductGroup[].class));
	}
	
	public List<Query> getQueries() throws NullPointerException, IOException, InterruptedException, URISyntaxException{
		HttpResponse<String> response = getResponse("product_groups");
		String json = response.body();
		System.out.println(json);
		if (Objects.equals(json, "{\"message\":\"You have reached the request limit\"}")) {
			return null;
		}
		return Arrays.asList(gson.fromJson(json, Query[].class));
	}
	
	private HttpResponse<String> getResponse(String page) throws NullPointerException, IOException, InterruptedException, URISyntaxException{
		HttpClient httpClient = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().version(HttpClient.Version.HTTP_2).uri(new URI("https://selly.gg/api/v2/" + page)).setHeader("Authorization", "Basic " + encode).GET().build();
		HttpResponse<String> r = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
		return r;
	}
}