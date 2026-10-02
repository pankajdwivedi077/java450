import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Student{

    int roll;
    String name;
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + roll;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (roll != other.roll)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

    

}

public class File6 {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(20);

        Set<Integer> s2 = new LinkedHashSet<>();

        Set<Integer> s3 = new TreeSet<>();
    }
}
