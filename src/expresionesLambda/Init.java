package expresionesLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import expresionesLambda.dto.Person;

public class Init {
	
	 public static void main(String[] args) {
		 
	        System.out.println("Hola mundo");
	        System.out.println("Recorriendo array");
	        for (String numero : Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10")) {
				System.out.print(numero + " ");
			}
	        System.out.println(" \nFIN Recorriendo array");
	     // imprimir una lista utilizando expresiones lambda en Java 8
	        System.out.println(" \nInicio Recorriendo array expresiones lambda");
			Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(
					n -> System.out.print(n + " "));
			 System.out.println(" \nFIN Recorriendo array expresiones lambda");
	 
			// otra forma utilizando expresiones Lambdas
			 System.out.println(" \nInicio Recorriendo  array otra expresiones lambda");
			Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(
					System.out::println);
			 System.out.println(" \nFin Recorriendo  array otra expresiones lambda");
			 
			 System.out.println(" \nInicio Mayores a 5");
			   ArrayList<Integer> menor= new ArrayList<>();
				//filtrar los número mayores que 5 y añadirlos en la lista menor
				for (Integer numero : Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) {
					if (numero>5) {
						menor.add(numero);
					}
				}
				
				// imprimir la lista con los números mayores que 5
				for (Integer integer : menor) {
					System.out.println(integer);
				}
			 
			System.out.println(" \nFin Mayores a 5");
			
			System.out.println(" \nInicio Mayores a 5 expresiones lambda");
			ArrayList<Integer> mayores = (ArrayList<Integer>) Arrays
					.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
					// se crea el stream
					.stream()
					//filtro para obtener los números mayores a 5 y dentro se utiliza la expresión lambda (x -> x > 5)
					.filter(x -> x > 5)
					//pone los elementos que se filtró dentro de una nueva lista, dentro se utiliza una expresión lambda  
					.collect(Collectors.toCollection(() -> new ArrayList<Integer>()));
	 
			mayores.forEach(z -> System.out.println(z));
	        
			System.out.println(" \nFin Mayores a 5 expresiones lambda");
			
			
			System.out.println(" \nInicio numeros pares expresiones lambda");
			ArrayList<Integer> pares = (ArrayList<Integer>) Arrays
					.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
					// se crea el stream
					.stream()
					//filtro para obtener los números mayores a 5 y dentro se utiliza la expresión lambda (x -> x > 5)
					.filter(x -> x%2==0)
					//pone los elementos que se filtró dentro de una nueva lista, dentro se utiliza una expresión lambda  
					.collect(Collectors.toCollection(() -> new ArrayList<Integer>()));
	 
			pares.forEach(e -> System.out.println(e));
	        
			System.out.println(" \nFin numeros pares expresiones lambda");
			
			
			System.out.println(" \nInicio por metodo");
			List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7,8,9,10);

			System.out.println("Números pares:");
			evaluar(listaNumeros, (n)-> n%2 == 0 );

			System.out.println("Números impares:");
			evaluar(listaNumeros, (n)-> n%2 == 1 );

			System.out.println("Números mayores a 5:");
			evaluar(listaNumeros, (n)-> n > 5 );
			
			System.out.println(" \nFIN por metodo");
			
			
			System.out.println("INICIO PERSON");
			List<Person> listPerson=Arrays.asList(new Person("Gonzalo","lito",33),new Person("Roberto","maño",34),new Person("Victor","pajaro",28));
			System.out.println("Buscar lito por metodo:");
			evaluaPerson(listPerson, c ->"lito".equals(c.getMote()));
			System.out.println("FIN Buscar lito por metodo:");
			
			System.out.println("Buscar lito por filtro:");
			ArrayList<Person> listPersonFilter=Arrays.asList(new Person("Gonzalo","lito",33),new Person("Roberto","maño",34),new Person("Victor","pajaro",28))
											.stream()
											//filtro para obtener los números mayores a 5 y dentro se utiliza la expresión lambda (x -> x > 5)
											.filter(c ->"lito".equals(c.getMote())||"maño".equals(c.getMote()))
											//pone los elementos que se filtró dentro de una nueva lista, dentro se utiliza una expresión lambda  
											.collect(Collectors.toCollection(() -> new ArrayList<Person>()));
			
			listPersonFilter.forEach(e->System.out.println(e));
			System.out.println("FIN Buscar lito por filtro:");
			
	    }
	 
	 public static void evaluar(List<Integer> listaNumeros, Predicate<Integer> predicado) {
			for(Integer n: listaNumeros)  {
				if(predicado.test(n)) {
					System.out.println(n + " ");
				}else {
					System.out.println("NO CUMPLE:"+n + " ");
				}
			}
			System.out.println();
		}
	 
	 public static void evaluaPerson(List<Person> listaPersonas, Predicate<Person> predicado) {
			for(Person n: listaPersonas)  {
				if(predicado.test(n)) {
					System.out.println(n + " ");
				}else {
					System.out.println("NO CUMPLE:"+n + " ");
				}
			}
			System.out.println();
		}
}
