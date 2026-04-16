package com.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class AppTest {
@Test
public void testAdd() {
App app = new App();
assertEquals(5, app.add(2, 3));
}
}




scriptt : 

pipeline {
agent any
tools {
maven 'M3'
}
stages {
stage('Checkout Git') {
steps {
git branch: 'main',
url: 'https://github.com/balaganeshn/simple-maven-app'
}
}
stage('Build and Test') {
steps {
bat 'mvn clean test'
}
}
}
}
