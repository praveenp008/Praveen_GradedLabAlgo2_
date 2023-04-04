package com.glearning.client;

import java.util.Scanner;

import com.glearning.service.TransactionService;

class TransactionClient {

	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		int size = s.nextInt();
		int arr[] = new int[size];

		TransactionService transactionService = new TransactionService();
		transactionService.targetTransaction(arr, size);
	}
}