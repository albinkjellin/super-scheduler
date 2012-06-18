package com.mule.hackathon2012.transformers;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.hackathon2012.panel.request.PanelDataExtractRequest;
import org.mule.hackathon2012.panel.request.RequestData;
import org.mule.transformer.AbstractMessageTransformer;

public class ToObjectArrayTransformer extends AbstractMessageTransformer{

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {
		// TODO Auto-generated method stub
		
		PanelDataExtractRequest panelExtractRequest = new PanelDataExtractRequest();
		PanelDataExtractRequest.RequestDataList dummyList = new PanelDataExtractRequest.RequestDataList();
		dummyList.getRequestData().add((RequestData) message.getPayload());
		panelExtractRequest.setRequestDataList(dummyList);
		panelExtractRequest.setInterfaceId("ABC");
		//message.setPayload(new Object(){panelExtractRequest, })
		return null;
	}

}
