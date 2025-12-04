package com.qa.Analyzer;

import java.lang.reflect.Constructor;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import com.github.dockerjava.transport.DockerHttpClient.Request.Method;

public class MyTransformer implements IAnnotationTransformer {
	
public void transform(ITestAnnotation annotation,Class testclass, Method testmethod,Constructor testconstructor) {
	annotation.setRetryAnalyzer(RetryAnalyzer.class);
		


		}}

