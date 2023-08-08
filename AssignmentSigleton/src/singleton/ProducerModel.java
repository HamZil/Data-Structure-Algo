package singleton;

public class ProducerModel {

	private int producer_id;
	private String Name ;
	private int age ;
	
	public int getProducer_id() {
		return producer_id;
	}

	public void setProducer_id(int producer_id) {
		this.producer_id = producer_id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ProducerModel(int producer_id, String name, int age) {
		super();
		this.producer_id = producer_id;
		Name = name;
		this.age = age;
	}

}
