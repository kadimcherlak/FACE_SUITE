package framework.tests.steps.oracle_fusion_cloud;

import java.util.Random;

public class Data extends framework.core.models.Data {

	// Alpha sorted list of models items (yes it will be long normally)
	private String actualAmount;
	private String addressLine1;
	private String addressLine2;
	private String assignmentCategory;
	private String businessUnit;
	private String city;
	private String companyEntity;
	private String costCenter;
	private String country;
	private String countryCode;
	private String county;
	private String dateOfBirth;
	private String department;
	private String email;
	private String erProfitCenter;
	private String firstName;
	private String gender;
	private String grade;
	private String hireAction;
	private String hireDate;
	private String hireReason;
	private String hourlyPaidOrSalaried;
	private String job;
	private String lastName;
	private String legalEmployer;
	private String location;
	private String maritalStatus;
	private String nationalID;
	private String nationalIDType;
	private String newlySeparatedVeteranDischargeDate;
	private String number;
	private String password;
	private String payroll;
	private String pearsonEmailRequired;
	private String payCheckDate;
	private String salaryAmount;
	private String salaryBasis;
	private String state;
	private String type1;
	private String type2;
	private String userName;
	private String veteranSelfIdentificationStatus;
	private String workerType;
	private String workingAsManager;
	private String zipCode;
	private String personNumber;
	private String elementName;
	private String elementNameADP;
	private String effectiveAsOfDate;
	private String employeeManagerChange;
	private String changeManagerReason;
	private String managerName;

	public String getPersonNumber() {
		return personNumber;
	}

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    // Alpha sorted list of getters
    // most of these items get loaded via bean loader, so normally setters not needed.
    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getAssignmentCategory() {
        return assignmentCategory;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public String getCity() {
        return city;
    }

    public String getCompanyEntity() {
        return companyEntity;
    }

    public String getCostCenter() {
        return costCenter;
    }

    public String getCountry() {
        return country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCounty() {
        return county;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public String geteffectiveAsOfDate() {
        return effectiveAsOfDate;
    }

    public String getEmail() {
        return email;
    }

    public String getErProfitCenter() {
        return erProfitCenter;
    }

    public String getelementName() {
        return elementName;
    }

    public String getFirstName() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return "FAUTO" + buffer.toString().toUpperCase();

    }

    public String getGender() {
        return gender;
    }

    public String getGrade() {
        return grade;
    }

    public String getHireAction() {
        return hireAction;
    }

    public String getHireDate() {
        return hireDate;
    }

    public String getHireReason() {
        return hireReason;
    }

    public String getHourlyPaidOrSalaried() {
        return hourlyPaidOrSalaried;
    }

    public String getJob() {
        return job;
    }

    public String getLastName() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return "LAUTO" + buffer.toString().toUpperCase();
    }


    public String getLegalEmployer() {
        return legalEmployer;
    }

    public String getLocation() {
        return location;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getNationalID() {
        Random rnd = new Random();
        String ssn_temp = String.format("%09d", rnd.nextInt(1000000000));
        while (ssn_temp.startsWith("9") || ssn_temp.startsWith("000") || ssn_temp.startsWith("666")) {
            ssn_temp = String.format("%09d", rnd.nextInt(1000000000));
        }
        return ssn_temp.replaceFirst("(\\d{3})(\\d{2})(\\d+)", "$1-$2-$3");
    }

    public String getNationalIDType() {
        return nationalIDType;
    }

    public String getNumber() {
        return number;
    }

    public String getPassword() {
        return password;
    }

    public String getPayroll() {
        return payroll;
    }

    public String getPearsonEmailRequired() {
        return pearsonEmailRequired;
    }

    public String getSalaryAmount() {
        return salaryAmount;
    }

    public String getSalaryBasis() {
        return salaryBasis;
    }

    public String getState() {
        return state;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public String getUserName() {
        return userName;
    }

    public String getVeteranSelfIdentificationStatus() {
        return veteranSelfIdentificationStatus;
    }

    public String getnewlySeparatedVeteranDischargeDate() {
        return newlySeparatedVeteranDischargeDate;
    }


    public String getWorkerType() {
        return workerType;
    }

    public String getWorkingAsManager() {
        return workingAsManager;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String employeeManagerChange() {
        return employeeManagerChange;
    }

    public String changeManagerReason() {
        return changeManagerReason;
    }

    public String managerName() {
        return managerName;
    }


}

	}

	public String getGender() {
		return gender;
	}

	public String getGrade() {
		return grade;
	}

	public String getHireAction() {
		return hireAction;
	}

	public String getHireDate() {
		return hireDate;
	}

	public String getHireReason() {
		return hireReason;
	}

	public String getHourlyPaidOrSalaried() {
		return hourlyPaidOrSalaried;
	}

	public String getJob() {
		return job;
	}

	public String getLastName() {
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 8;
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(targetStringLength);
		for (int i = 0; i < targetStringLength; i++) {
			int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
			buffer.append((char) randomLimitedInt);
		}
		String lastName = "LAUTO" + buffer.toString().toUpperCase();
		return lastName;
	}

	public String getLegalEmployer() {
		return legalEmployer;
	}

	public String getLocation() {
		return location;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public String getNationalID() {
		Random rnd = new Random();
		String ssn_temp = String.format("%09d", rnd.nextInt(1000000000));
		String nationalID = String.valueOf(ssn_temp).replaceFirst("(\\d{3})(\\d{2})(\\d+)", "$1-$2-$3");
		return nationalID;
	}

	public String getNationalIDType() {
		return nationalIDType;
	}

	public String getNumber() {
		return number;
	}

	public String getPassword() {
		return password;
	}

	public String getPayroll() {
		return payroll;
	}

	public String getPearsonEmailRequired() {
		return pearsonEmailRequired;
	}

	public String getSalaryAmount() {
		return salaryAmount;
	}

	public String getSalaryBasis() {
		return salaryBasis;
	}

	public String getState() {
		return state;
	}

	public String getType1() {
		return type1;
	}

	public String getType2() {
		return type2;
	}

	public String getUserName() {
		return userName;
	}

	public String getVeteranSelfIdentificationStatus() {
		return veteranSelfIdentificationStatus;
	}

	public String getnewlySeparatedVeteranDischargeDate() {
		return newlySeparatedVeteranDischargeDate;
	}

	public String getWorkerType() {
		return workerType;
	}

	public String getWorkingAsManager() {
		return workingAsManager;
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getEmployeeManagerChange() {
		return employeeManagerChange;
	}

	public String getChangeManagerReason() {
		return changeManagerReason;
	}

	public String getManagerName() {
		return managerName;
	}

}
