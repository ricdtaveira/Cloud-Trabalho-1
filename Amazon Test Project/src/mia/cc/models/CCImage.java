package mia.cc.models;

/**
 * Classe para representar os diferentes tipos de imagens das instâncias (computadores) na amazon
 * @author Yvens
 *
 */
public class CCImage {

	private String name;
	private String description;
	private String id;
	
	public CCImage(String name, String description, String id) {
		this.name = name;
		this.description = description;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
