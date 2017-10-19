public class Cliente {
		//Atributos
		private String nombre;
		private double cantidadAdd;
						
		/**
		 *@param nombre - nombre del cliente
		 *@param cantidadAdd- cantidad de dinero a añadir a la cuenta del cliente como deuda
		*/
		
		//Constructores
		
		//Constructor pasandole 2 parametros
		public Cliente (String nombre,double cantidadAdd) {
			this.nombre=nombre;
			this.cantidadAdd=cantidadAdd;
			
		}
		
		//Métodos
		
		//Setters and Getters
		public String isNombre()
		{
			return this.nombre;
		}
		
		public void setNombre (String nombre)
		{
			this.nombre=nombre;
		}
		
		public double isCantidadAdd() 
		{
			return this.cantidadAdd;
		}
		
		public void setCantidadAdd(double CantidadAdd)
		{
			this.cantidadAdd=CantidadAdd;
		}
		
		
		@Override
		public String toString() {
			return "Cliente [nombre=" + nombre + ", deuda=" + cantidadAdd + "]";
		}
		
}
