//package com.javatechie.springdroolsapi;
//
//import java.io.IOException;
//
//import org.kie.api.KieServices;
//import org.kie.api.builder.KieBuilder;
//import org.kie.api.builder.KieFileSystem;
//import org.kie.api.builder.KieModule;
//import org.kie.api.builder.KieRepository;
//import org.kie.api.builder.ReleaseId;
//import org.kie.api.io.Resource;
//import org.kie.api.runtime.KieContainer;
//import org.kie.api.runtime.KieSession;
//import org.kie.internal.io.ResourceFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class DroolConfig {
//
//	private KieServices kieServices = KieServices.Factory.get();
//
//	private KieFileSystem getKieFileSystem() throws IOException {
//		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
//		kieFileSystem.write(ResourceFactory.newClassPathResource("/..offer.drl"));
//		return kieFileSystem;
//	}
//
////	@Bean
////	public KieContainer getKieContainer() throws IOException {
////		System.out.println("Container created...");
////		getKieRepository();
////		KieBuilder kb = kieServices.newKieBuilder(getKieFileSystem());
////		kb.buildAll();
////		KieModule kieModule = kb.getKieModule();
////		KieContainer kContainer = kieServices.newKieContainer(kieModule.getReleaseId());
////		return kContainer;
////
////	}
////=================================================================
////	@Bean
////	public KieSession getKieContainer() throws IOException {
////		System.out.println("Container created...");
////		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
////		kieFileSystem.write(ResourceFactory.newClassPathResource("offer.drl"));
////		
////		 KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
////	        kb.buildAll();
////
////	        KieRepository kieRepository = kieServices.getRepository();
////	        ReleaseId krDefaultReleaseId = kieRepository.getDefaultReleaseId();
////	        KieContainer kieContainer = kieServices.newKieContainer(krDefaultReleaseId);
////
////	        return kieContainer.newKieSession();
////
////	}
////	
////=================================================================	
//	private void getKieRepository() {
//
//		final KieRepository kieRepository = kieServices.getRepository();
//		kieRepository.addKieModule(new KieModule() {
//
//			public ReleaseId getReleaseId() {
//				return kieRepository.getDefaultReleaseId();
//			}
//
//		});
//
//	}
//
////	@Bean
////	public KieSession getKieSession() throws IOException {
////		System.out.println("Session created...");
////		return getKieContainer().newKieSession();
////	}
//	
//	@Bean
//	public KieSession getKieSession(Resource dt) throws IOException {
//		System.out.println("Session created...");
//		  KieFileSystem kieFileSystem = kieServices.newKieFileSystem()
//		            .write(dt);
//
//		        KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem)
//		            .buildAll();
//
//		        KieRepository kieRepository = kieServices.getRepository();
//
//		        ReleaseId krDefaultReleaseId = kieRepository.getDefaultReleaseId();
//
//		        KieContainer kieContainer = kieServices.newKieContainer(krDefaultReleaseId);
//
//		        KieSession ksession = kieContainer.newKieSession();
//
//		        return ksession;
//	}
//	
//
//}
