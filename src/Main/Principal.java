package Main;

import java.util.Scanner;

import Dominio.Llantas;
import Implementacion.LogicaMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectura=null;
		
		 long codigoBarra;
		 String marca;
		 String medidas;
		 float precio;
		 int existencia, menPrinc;
		 
		 Llantas llanta;
		 
		 LogicaMetodos imp = new LogicaMetodos();
		 do {
			 
			System.out.println("MENU PRINCIPAL");
			System.out.println("1.-- Alta");
			System.out.println("2.-- Mostrar");
			System.out.println("3.-- Buscar");
			System.out.println("4.-- Editar ");
			System.out.println("5.-- Eliminar");
			System.out.println("6.-- Salir");
			 
			lectura = new Scanner (System.in);
			menPrinc = lectura.nextInt();
			
			switch (menPrinc) {
			case 1:
				try {
					System.out.println("Ingresa el codigo de barra");
					lectura = new Scanner (System.in);
					codigoBarra = lectura.nextLong();
					
					System.out.println("Ingresa la marca");
					lectura = new Scanner (System.in);
					marca = lectura.nextLine();
					
					System.out.println("Ingresa las medidas");
					lectura = new Scanner (System.in);
					medidas = lectura.nextLine();
					
					System.out.println("Ingresa el precio");
					lectura = new Scanner (System.in);
					precio = lectura.nextFloat();
					
					System.out.println("Ingresa la existencia");
					lectura = new Scanner (System.in);
					existencia = lectura.nextInt();
					
					//CREAR EL OBJETO
					
					llanta = new Llantas(codigoBarra, marca, medidas, precio, existencia);
					
					//agregar al hashmap
					
					imp.guardar(llanta);
					System.out.println("se agregaron los registros");
					
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("ERROR AL GUARDAR " +e.getMessage());
				}
				
				break;
			case 2:
				imp.mostrar();
				
				break;
			case 3:
				try {
					System.out.println("ingresa el codigo de barra a buscar");
					lectura = new Scanner (System.in);
					codigoBarra = lectura.nextLong();
					
					//BUSCAR
					llanta = imp.buscar(codigoBarra);
					
					if (llanta !=null)
					System.out.println("SE ENCONTRO "+ llanta);
					else
						System.out.println("NO SE ENCONTRO EL REGISTRO");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("ERROR AL BUSCAR");
				}
				break;
				
			case 4:
				
				try {
					System.out.println("ingresa el codigo de barra a buscar");
					lectura = new Scanner (System.in);
					codigoBarra = lectura.nextLong();
					
					//BUSCAR
					llanta = imp.buscar(codigoBarra);
					
					if (llanta !=null) {
						System.out.println("SE ENCONTRO "+ llanta);
					
						//ACTUALIZACION
						
						System.out.println("Ingresa la nueva marca");
						lectura = new Scanner (System.in);
						marca = lectura.nextLine();
						
						//ACTUALIZAR EL OBJETO
						
						llanta.setMarca(marca);
						
						//ACUALIZA EL HASHMAP
						
						imp.editar(llanta);
						
						System.out.println("se edito con exito");
					
					}
					else
						System.out.println("NO SE ENCONTRO EL REGISTRO");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("ERROR AL EDITAR");
				}
				
				break;
			case 5:
				
				try {
					System.out.println("ingresa el codigo de barra a eliminar");
					lectura = new Scanner (System.in);
					codigoBarra = lectura.nextLong();
					
					imp.eliminar(codigoBarra);
					System.out.println("ELIMINADO");
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("ERROR AL LIMINAR");
				}
				
				break;
			case 6:
				System.out.println("BYE");
				break;
			}
			 
		} while (menPrinc <6);
		
		
	}

}
