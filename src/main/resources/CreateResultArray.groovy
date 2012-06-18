import org.mule.hackathon2012.panel.request.PanelDataExtractRequest;
import org.mule.hackathoorg.mule.hackathon2012.panel.request.PanelDataExtractRequest.RequestDataList;
import org.mule.hackathon2012.panel.request.RequestData;

def panelExtractRequest = new PanelDataExtractRequest()
def dummyList = new PanelDataExtractRequest.RequestDataList()
dummyList.getRequestData().add(payload)
panelExtractRequest.setRequestDataList(dummyList)
panelExtractRequest.setInterfaceId(rootMessage.payload[1].interfaceId)
def returnArray = new Object[2]
returnArray[0] = rootMessage.payload[0] 
returnArray[1] = panelExtractRequest
println 'returnArray = '+ returnArray
println 'returnArray.getClass() = '+ returnArray.getClass()
return returnArray