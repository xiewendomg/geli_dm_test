package com.deepexi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test_Geli {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");//chromedriver服务地址
        WebDriver driver = new ChromeDriver(); //新建一个WebDriver 的对象，但是new 的是FirefoxDriver的驱动
        driver.get("http://139.159.207.92/gree-console/index.html#/login");//打开指定的网站
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div/form/div[1]/div/div/input")).sendKeys("admin");
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div/form/div[2]/div/div[1]/input")).sendKeys("abcd1234");//找到kw元素的id，然后输入hello
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div/form/div[3]/div/button")).click(); //点击登录按扭

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/section/div[2]/div[3]/div/div/div[1]/form/div/div/span/button[1]/span")).click(); //点击会员新增按扭
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div/section/div[2]/div[3]/div/div[2]/form/div[1]/div/div/input")).sendKeys("13227843219");//手机号码
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/section/div[2]/div[3]/div/div[2]/form/div[3]/div/div/input")).sendKeys("红红");//昵称
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/section/div[2]/div[3]/div/div[2]/form/div[4]/div/div/section/div/input")).sendKeys("E:\\测试\\女人.jpg"); //头像地址

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/section/div[2]/div[3]/div/div[6]/form/div[1]/div/div/input")).sendKeys("增招募");//姓名
//        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div/form/div[1]/div/div/input")).sendKeys("admin");
//        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div/form/div[2]/div/div[1]/input")).sendKeys("abcd1234");//找到kw元素的id，然后输入hello
//        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div/form/div[1]/div/div/input")).sendKeys("admin");
//        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div/form/div[2]/div/div[1]/input")).sendKeys("abcd1234");//找到kw元素的id，然后输入hello
//        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div/form/div[1]/div/div/input")).sendKeys("admin");
//        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div/form/div[2]/div/div[1]/input")).sendKeys("abcd1234");//找到kw元素的id，然后输入hello
//        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div/form/div[1]/div/div/input")).sendKeys("admin");
//        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div/form/div[2]/div/div[1]/input")).sendKeys("abcd1234");//找到kw元素的id，然后输入hello
//        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div/form/div[1]/div/div/input")).sendKeys("admin");
//        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div/form/div[2]/div/div[1]/input")).sendKeys("abcd1234");//找到kw元素的id，然后输入hello
//        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div/form/div[1]/div/div/input")).sendKeys("admin");
//        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div/form/div[2]/div/div[1]/input")).sendKeys("abcd1234");//找到kw元素的id，然后输入hello
//        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div/form/div[1]/div/div/input")).sendKeys("admin");
//        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div/form/div[2]/div/div[1]/input")).sendKeys("abcd1234");//找到kw元素的id，然后输入hello
//        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div/form/div[3]/div/button")).click();

        try {
            /**
             * WebDriver自带了一个智能等待的方法。
             dr.manage().timeouts().implicitlyWait(arg0, arg1）；
             Arg0：等待的时间长度，int 类型 ；
             Arg1：等待时间的单位 TimeUnit.SECONDS 一般用秒作为单位。
             */
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        /**
         * dr.quit()和dr.close()都可以退出浏览器,简单的说一下两者的区别：第一个close，
         * 如果打开了多个页面是关不干净的，它只关闭当前的一个页面。第二个quit，
         * 是退出了所有Webdriver所有的窗口，退的非常干净，所以推荐使用quit最为一个case退出的方法。
         */
//        driver.quit();//退出浏览器
    }
}
