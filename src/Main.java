import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Pedimos por teclado el nombre y la cantidad
				Scanner teclado=new Scanner(System.in);
				
				//Creamos el array listadoClientes
				ArrayList <Cliente> listadoClientes = new ArrayList <Cliente>();
				boolean decision=true;
				
				while (decision==true)
				{
				
					System.out.println("Nombre cliente: ");
					String nombre=teclado.next(); //Metemos en la variable nombre el resultado
						
					System.out.println("Cantidad: ");
					float cantidad=teclado.nextFloat();//Metemos en la variable cantidad el resultado
						
					//Creamos objeto cliente pasandole los parametros del teclado
					Cliente cliente =new Cliente (nombre,cantidad); 
					cliente.setNombre(nombre);
					cliente.setCantidadAdd(cantidad);
					
					//Añadimos los datos al array	
					listadoClientes.add(cliente);
										
					System.out.println("Quieres crear otro cliente: ");
					String rdo=teclado.next();
				
					if (rdo.equals("si"))
					{
						decision=true;
					}
					else
					{
						
						decision=false;
					}
			
				
				}
				
					
					System.out.println("Nombre\tDeuda");
					System.out.println("---------------------------");
					double suma=0; // para la suma total de la duda
					
					//Recorremos el array
					for (int i=0;i<=listadoClientes.size()-1;i++) {
					
					listadoClientes.get(i);
					//Acumulamos la deuda en la suma
					suma+=listadoClientes.get(i).isCantidadAdd();
					//Creo la linea a imprimir
					String linea=listadoClientes.get(i).isNombre()+"\t"+listadoClientes.get(i).isCantidadAdd()+"\n";
					//E imprimo la linea
					System.out.println(linea);
					
				}
					System.out.println("---------------------------");
					System.out.println("Deuda total: "+suma+ "€");
			
					/*OTRA FORMA
					 
					 /Probamos a imprimir la lista, después ya la ponemos bonita
					 
					System.out.println("Nombre\tDeuda");
					System.out.println("-------------------");
					double suma = 0; //Para guardar el acumulador de la deuda
					for (int i = 0; i<=listaClientes.size()-1; i++) {
						//Extraigo el cliente de la lista
						Cliente clienteExtraido = listaClientes.get(i);
						//Acumulamos la deuda en la suma
						suma += clienteExtraido.getDeuda();
						//Creo la línea a imprimir
						String linea = clienteExtraido.getNombre() + "\t" + clienteExtraido.getDeuda() + "\n";
						//E imprimo la línea
						System.out.print(linea);
					}
					
					System.out.println("Deuda total: " + suma + " €");
					
					*/
					
	}
}

