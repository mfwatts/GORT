import java.io.File;
import java.util.Scanner;

public class FOODBASIC {

	/**
	 * FOOD HANDLING
	 */
	
	enum TasteProfile {sweet, salty, acid, bitter, umami, fresh, chocolate, light, heavy}
	
	public static void main(String[] args) {}

	public static void apple(int qty) {
		//everything DOES NOT need to be defined as a method, methods created later
		//objects vs separate classes?
		//define boolean variables with ifs to avoid overuse of lengthy methods
		
		FOODBASIC apple = new FOODBASIC();
		//HANDLING
		boolean hold = false;
		if (apple.isHeld(/*CLASS OBJECT, CLASS PRESSURE SENSOR, CLASS VISUAL SENSOR*/))
			{hold=true;
			//RETREIVE MAX. PRESSURE
			arm.grip(/*NUMERICAL VALUE*/);}																	//arm.grip				adjusts grip strength/force
		
		//DENSITY/UNIT &IDENTITY CHECKING
		if (hold= true)																//apple.isHeld			apple in hand of robot
			double weight = (arm torque function);
		
		if (weight <= avgwT && weight>=avgwl){
			apple.use;																
			else apple.checkStatus();														//apple.checkStatus		confirmation of identity
		//archimedes?
			
		//QUALITY CHECK INFO
		boolean quality = (apple.visualTest());											//apple.visualTest		visual quality check
		if (quality = false) apple.discardFood();												//apple.discard			dump apple
		
		//STORAGE
			if (storage1=true)	apple.moveTo(storage1)									//apple.moveTo			move apple with current arm
			else if (storage2=true)	{apple.moveTo(storage2); println("Unable to use primary storage");}
			else try{storage1.rearrange(); apple.moveTo(storage1); if moved storage1.apple count++}						//storage.apple  invenory counter
			if (storage1=true) break;
			else try {storage2.rearrange(); apple.moveTo(storage2); if moved storage2.apple count++}						//storage.rearrange		duh.
		
		//ASSOCIATED FOODS
		//TASTE PARAMETER
			TasteProfile par1, par2, par3; 
			par1 = TasteProfile.acid; par2 = TasteProfile.fresh; par3 = TasteProfile.sweet;

		//SUBSTITUTION RULES
			if (quantity < qty && substitution = par1 && substitution qty >= needed substQty)
				substitution.use();														//apple.use				perform cooking functions
		
		//ACTION RULES
			//APPLE CORER
			if (apple.removeCore)														//SU apple.removeCore	remove core
				apple.peeler();															// apple.peeler			peeler- special peeler for other fruit? apple can share with other prunus
			apple.quarter();																// apple.quarter		quarters object around pre-decided axis	
			
		//INVENTORY AMT
		double total = (storage1.apple+storage2.apple)
		
		//INDETERMINANTLY PRODUCED PRODUCTS?
		//(CREATE INSTRUCTIONS)

		}				
	}
public void quarter(){}
public void peeler(){}
public void removeCore(){}
public void use(){}
public void discardFood(Class object){
	Object.moveTo(trash);	
}

public void moveTo(String location){
	apple.grip();
	Scanner coordinate = new Scanner(new File (location));
	double x = coordinate.nextDouble();
	double y = coordinate.nextDouble();
	double z = coordinate.nextDouble();
	double placement = coordinate.nextDouble();
}

public void visualTest(){}
public void checkStatus(){}
public boolean isHeld(Class object, Class sensorP, Class sensorV){
	if (sensorP.positive(object)&&sensorV.positive(object))
		return true;
	else return false;
}
public double apple(){return 0;}

//robot
public void grip(){}
//inventory control
public void rearrange(){}
//public void (){}

}

// NEED A CLASS FOR
/*
 * TYPE 
 * HARDNESS/WEARABILITY/HANDLING 
 * DENSITY PER UNIT 
 * STORAGE 
 * ASSOCIATED FOODS
 * (CREATE INSTRUCTIONS) 
 * TASTE PARAMETER
 * QUALITY CHECK INFORMATION 
 * SUBSTITUTION RULES 
 * ACTION * RULES - NO""ETC. 
 * INVENTORY AMT
 * INDETERMINANTLY PRODUCED PRODUCTS?
 */
//ARRAY OF SAID CLASS OBJECTS
//CREATION OF PANTRY THROUGH JAVA OUTPUT - SEPARATE PROGRAM

// FRUIT BY TYPE

// PRUNUS
// CITRUS
// MELON BY TYPE
// BANANA
// MANGO
// BERRIES BY TYPE
// STONE FRUIT BY TYPE


// VEG BY TYPE

// TOMATOES BY TYPE
// ASPARAGUS
// SQUASH BY TYPE
// POTATOES
// SWEET POTATOES
// ROOT VEGETABLES BY TYPE
// PEAS BY TYPE
// PEPPERS BY TYPE
// CORN

// PROTEIN BY TYPE

// TURKEY
// CHICKEN
// HAM
// SHRIMP
// FISH BY TYPE
// LOBSTER
// SAUSAGE - TAKE INFORMATION FROM OTHER INGREDIENTS
// DAIRY BY TYPE
// YOGHURT
// ICE CREAM BY TYPE
// FATS BY TYPE
// MILK

// GRAINS BY TYPE

// RICE
// WHEAT
// OATMEAL
// QUINOA
// MILLET

// OTHER BY TYPE

// COCONUT
// COFFEE
// TEA
// DRINKS BY TYPE
// SEASONINGS BY TYPE
// WATER
// SALT
// PEPPER
// GARLIC
// SALAD DRESSING
// PROCESSED READY-TO-EAT BY TYPE
// PROCESSED (NOODLES ETC.) BY TYPE
// CANS