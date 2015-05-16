package automationFramework;

public class Testingstuff {

	public static void main(String[] args) {
	
		String[] expected = {"Select Make", "Acura", "Aston Martin", "Audi", "Bentley", "BMW", "Buick", "Cadillac", "Chevrolet", "Chevrolet Truck", "Chrysler", "Dodge", "Ferrari", "Fiat", "Fisker", "Ford", "Ford Truck", "GMC", "GMC Truck", "Honda", "Hyundai", "Infiniti", "Jaguar", "jeep", "kia", "lamborghini", "Land Rover", "lexus", "lincoln", "lotus", "maserati", "maybach", "mazda", "mercedes-benz" ,"mini", "mitsubishi", "nissan", "Nissan Truck", "porsche", "ram", "Rolls-Royce", "scion", "smart", "subaru", "suzuki", "tesla", "toyota", "Toyota Truck", "Volkswagen"}; 
		List<WebElement> selectOptions= new Select(driver.findElement(By.id("make_5"))).getOptions(); 
		for(int i = 0; i<selectOptions.size()-1; i++){ 
		String expectedOption = expected[i]; 
		String actualOption = selectOptions.get(i).getText(); 
		Assert.assertTrue("Expected: "+ expectedOption + " Actual: " + actualOption, actualOption.equalsIgnoreCase(expectedOption)); 
		} 
		driver.close();

	}

}
