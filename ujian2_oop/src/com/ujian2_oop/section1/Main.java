package com.ujian2_oop.section1;

import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
	
		Scanner scan =  new Scanner(System.in);
		
		System.out.print("Masukkan nama karyawan: ");
		String name = scan.nextLine();
		
		System.out.print("Masukkan ID karyawan: ");
		String id = scan.nextLine();
		
		System.out.print("Masukkan gaji karyawan: ");
		double amount = scan.nextDouble();
		
		System.out.print("Masukkan pajak karyawan: ");
		double tax = scan.nextDouble();
		
		
		Income income = new Income( amount, tax);
		Staff staff = new Staff(name, id, income);
		
		income.getIncomeType();
		
		
		System.out.println();
		System.out.println("==========================");
		System.out.println("     Data Pegawai        ");
		System.out.println("==========================");
		
		staff.displayStaffInfo();
		staff.displayIncomeInfo();
		
		System.out.println("==========================");
		
		
		
		
		
		
	    }
		
	}
