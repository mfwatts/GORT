//CLASS type VARIABLES  -  FOR ALL ITEMS, IN-USE OR NOT
/*
 * STRING 	name
 * DOUBLE	density
 * BOOLEAN 	storageNegBoolean	has storageNegParam
 * INTEGER	cleanup				{0, 1, 2, 3, 4}>{null, liquid, solid, dust, oil-based}
 * 			handlingOrientation	{}>{box, flat, round, liquid, small particles, large particles}
 * 			fireSafety			{1, 2, 3}>{flammable, burnable, fireproof} (flammable=oil; burnable; anything on a stove; fireproof = cold water)
 * 			coldTimeLimit		{-1, minutes}>{non-cold foods, cold foods by density TODO}
 * 			storageLifeParam	{storage life of item in days or hours}
 * 			storageParam		{0, 1, 2, 3 ...}>{null, freezer, fridge, cabinet, pantry, cellar...etc}
 * 			storagNegParam		{[nD of foods to avoid]} TODO multiples?
 * 			tasteParam{1..3}	{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}>{null, sweet, salty, acid, bitter, umami, fresh, chocolate, light, heavy} TODO chocolate?
 * 			cookingParam		{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}>{null, sweet, salty, acid, bitter, umami, fresh, chocolate, light, heavy} but used after an action
 */

//CLASS item VARIABLES - EXTENDS type
/*
 * BOOLEAN 	moving
 * DOUBLE 	quantity
 * INT		life		{use life, time spent out of fridge, etc, compared to storageLifeParam}
 */

/* OTHER INFORMATION
 * STORAGE 
 * ASSOCIATED FOODS
 * (CREATE INSTRUCTIONS) 
 * QUALITY CHECK INFORMATION 
 * SUBSTITUTION RULES 
 * ACTION * RULES - NO""ETC. 
 * INVENTORY AMT 
 * INDETERMINANTLY PRODUCED PRODUCTS?
 */



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