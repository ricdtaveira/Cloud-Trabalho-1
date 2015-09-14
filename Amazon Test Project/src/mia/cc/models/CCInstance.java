package mia.cc.models;

import com.amazonaws.services.ec2.model.Instance;

/**
 * Classe para agrupar as informações de uma instância (computador) na Amazon
 * @author Yvens
 *
 */
public class CCInstance 
{
	private String id;
	private String imageId;
	private CCInstanceStatus status;
	
	public CCInstance()
	{
		this("","",CCInstanceStatus.TERMINATED);
	}
	
	public CCInstance(Instance instance)
	{
		this(instance.getInstanceId(), instance.getImageId(), CCInstanceStatus.getStatus(instance.getState().getCode()));
	}
	
	public CCInstance(String id, String imageId, CCInstanceStatus status) {
		this.id = id;
		this.imageId = imageId;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public CCInstanceStatus getStatus() {
		return status;
	}

	public void setStatus(CCInstanceStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "CCInstance [id=" + id + ", imageId=" + imageId + ", status="
				+ status + "]";
	}
}
