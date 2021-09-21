package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getNameReturnsCorrectName() throws Exception {
        Restaurant testRestaurant = setupRestaurant();
        assertEquals("Dracula", testRestaurant.getName());
    }

    @Test
    public void getAddressReturnsCorrectAddress() throws Exception {
        Restaurant testRestaurant = setupRestaurant();
        assertEquals("123 Pennsylvania", testRestaurant.getAddress());
    }

    @Test
    public void getZipReturnsCorrectZip() throws Exception {
        Restaurant testRestaurant = setupRestaurant();
        assertEquals("01234", testRestaurant.getZipcode());
    }
    @Test
    public void getPhoneReturnsCorrectPhone() throws Exception {
        Restaurant testRestaurant = setupRestaurant();
        assertEquals("123-456-789", testRestaurant.getPhone());
    }

    @Test
    public void getWebsiteReturnsCorrectWebsite() throws Exception {
        Restaurant testRestaurant = setupAltRestaurant();
        assertEquals("No website listed", testRestaurant.getWebsite());
    }

    @Test
    public void getEmailReturnsCorrectEmail() throws Exception {
        Restaurant testRestaurant = setupAltRestaurant();
        assertEquals("No email available", testRestaurant.getEmail());
    }

    @Test
    public void setNameSetsCorrectName() throws Exception {
        Restaurant testRestaurant = setupRestaurant();
        testRestaurant.setName("Motionless");
        assertNotEquals("Dracula",testRestaurant.getName());
    }

    @Test
    public void setAddressSetsCorrectAddress() throws Exception {
        Restaurant testRestaurant = setupRestaurant();
        testRestaurant.setAddress("1018 Scranton");
        assertNotEquals("123 Pennsylvania", testRestaurant.getAddress());
    }

    @Test
    public void setZipSetsCorrectZip() throws Exception {
        Restaurant testRestaurant = setupRestaurant();
        testRestaurant.setZipcode("78902");
        assertNotEquals("01234", testRestaurant.getZipcode());
    }
    @Test
    public void setPhoneSetsCorrectPhone() throws Exception {
        Restaurant testRestaurant = setupRestaurant();
        testRestaurant.setPhone("971-898-7878");
        assertNotEquals("123-456-789", testRestaurant.getPhone());
    }

    @Test
    public void setWebsiteSetsCorrectWebsite() throws Exception {
        Restaurant testRestaurant = setupRestaurant();
        testRestaurant.setWebsite("http://motionless.com");
        assertNotEquals("http://dracula.com", testRestaurant.getWebsite());
    }

    @Test
    public void setEmailSetsCorrectEmail() throws Exception {
        Restaurant testRestaurant = setupRestaurant();
        testRestaurant.setEmail("rock@motionless.com");
        assertNotEquals("eat@dracula.com", testRestaurant.getEmail());
    }

    public Restaurant setupAltRestaurant (){
        return new Restaurant("Dracula", "123 Pennsylvania", "01234", "123-456-789");
    }

    //helper
    public Restaurant setupRestaurant (){
        return new Restaurant("Dracula", "123 Pennsylvania", "01234", "123-456-789", "http://dracula.com", "eat@dracula.com");
    }
}