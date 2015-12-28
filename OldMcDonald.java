import java.util.*;	

	public class OldMcDonald{
	private Animal[] _farm;
	private static final int N = 3;
	
	public OldMcDonald(){
		_farm = new Animal[N];
		Animal a1 = new Animal("Cow", "Moo");
		Animal a2 = new Animal("Dog", "Woof");
		Animal a3 = new Animal("Duck", "Quack");
		
		_farm[0] = a1;
		_farm[1] = a2;
		_farm[2] = a3;	
		// create a farm, an animal array;
	}
	public void sing(){
		for(int i = 0; i< N; i++){
			System.out.println("Old McDonald had a farm, E-I-E-I-O\n" + "And on his farm he had a " + _farm[i].getName() + ", E-I-E-I-O\n" + 
		"With a " +	_farm[i].getSound() + " " + _farm[i].getSound() + " here and a " +
					_farm[i].getSound() + " " + _farm[i].getSound() + " there\n" +_farm[i].getSound()
			+ " here " + _farm[i].getSound() + " there, everywhere " + 
					_farm[i].getSound() + " " + _farm[i].getSound() +"\n" +"Old McDonald had a farm, E-I-E-I-O\n" ); }
			// ADD the rest of the lyrics here.
			
		}
	public static void main(String[] args){
		
			(new OldMcDonald()).sing();
		}
	}
	class Animal {
		private String name;
		private String sound;
		//implement data and functionality of an animal here.
/*		public Animal(String animal){
			if(_farm[0].equals(animal))
				this.sound = "Moo";
			if(_farm[1].equals(animal))
				this.sound = "Woof";
			if(_farm[2].equals(animal))
				this.sound = "Quack";
		}*/
		Animal(String name, String sound){
			this.name = name;
			this.sound = sound;
		}
		public String getName(){
			return name;
		}
		public String getSound(){
			return sound;
		}
		
	
		
		
	
		
		/*(String name){
			if(_farm[0].equals(name))
				return "Moo";
			if(_farm[1].equals(name))
				return "Woof";
			if(_farm[2].equals(name))
				return "Quack";
		}*/
	
	}


