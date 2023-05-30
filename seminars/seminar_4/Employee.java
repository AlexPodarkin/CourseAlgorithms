package seminars.seminar_4;

public class Employee 
{
    private String name;
    private Integer age;
    private Double salary;
    
    public Employee() 
    {
    }

    public Employee(String name, Integer age, Double salary) 
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int hashCode() 
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((age == null) ? 0 : age.hashCode());
        result = prime * result + ((salary == null) ? 0 : salary.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (name == null) 
        {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age == null) 
        {
            if (other.age != null)
                return false;
        } else if (!age.equals(other.age))
            return false;
        if (salary == null) 
        {
            if (other.salary != null)
                return false;
        } else if (!salary.equals(other.salary))
            return false;
        return true;
    }
}

