package com.ssm.test;



import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.domain.Expert;
import com.ssm.service.ExpertService;


public class UpdateExpertTest extends BaseTest {
	@Autowired
    private ExpertService expertService;
	
	@Test
    public void update() {
		Expert expert=new Expert();
		expert.setId(1);
		expert.setName("���Ĺ�");
		expert.setMajor("�������ѧ�뼼��");
		expert.setSchool("�人��ѧ");
		expert.setIntruduction("���޼��");
		expert.setPaper("��������");
		expert.setResearch_direction("�����ھ������ݷ���");
		expert.setSubject("�������");
       int i= expertService.update(expert);
      if(i==1) {System.out.println("���³ɹ�");
    }else {
    	System.out.println("����ʧ��");}
    }



}