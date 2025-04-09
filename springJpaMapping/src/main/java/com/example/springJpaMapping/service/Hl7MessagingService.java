package com.example.springJpaMapping.service;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.v23.message.ADT_A01;
import ca.uhn.hl7v2.model.v23.segment.*;
import ca.uhn.hl7v2.parser.Parser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@AllArgsConstructor
 @Slf4j
 @Data
 @Service
public class Hl7MessagingService
    {
        @SneakyThrows
        public static ADT_A01 create_ADT_A01(){
            try {
                ADT_A01 adt = new ADT_A01();
                adt.initQuickstart("ADT", "A01", "p");

                MSH msh = adt.getMSH();
                msh.getMsh3_SendingApplication().getNamespaceID().setValue("tetrus");
                msh.getMsh4_SendingFacility().getNamespaceID().setValue("surge");
                msh.getMsh6_ReceivingFacility().getNamespaceID().setValue("ecw");
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MM_DD_YYYY");

                PID pid = adt.getPID();
                pid.getPatientName(0).getFamilyName().setValue("aravind");
                pid.getPatientName(0).getGivenName().setValue("kumar");
                pid.getBirthOrder().setValue("123");

                pid.getSex().setValue("M");

                PV1 pv1=adt.getPV1();
                pv1.getServicingFacility().setValue("sdfhcbjn");
                pv1.getAttendingDoctor().clone();
                pv1.getPv11_SetIDPatientVisit().setValue("12");
                pv1.getAccountStatus().setValue("accoutStatus");

                IN1 in1 = adt.getINSURANCE().getIN1();
                in1.getIn11_SetIDInsurance().setValue("1");
                in1.getAssignmentOfBenefits().setValue("456ascasc");
                in1.getBillingStatus().setValue("success");
                in1.getCompanyPlanCode().setValue("sdsdefdcd");
               // OBR obr = adt.getOBX

                OBX obr=adt.getOBX();
                obr.getUserDefinedAccessChecks().setValue("ada");
                obr.getDateLastObsNormalValues().getTs1_TimeOfAnEvent().setValue(new Date());
                obr.getNatureOfAbnormalTest().setValue("adszfcf");
                obr.getAbnormalFlags(obr.getAbnormalFlagsReps());
                obr.getObservationIdentifier().getAlternateIdentifier().setValue("sdfsdf");

                HapiContext context = new DefaultHapiContext();
                Parser parser = context.getPipeParser();
                String encodedMessage = parser.encode(adt);
                log.info("printing value"+encodedMessage);

                return adt;
            }catch (HL7Exception e){
                log.info("error creating orm message" +e);
            }
            return null;

        }
    }


