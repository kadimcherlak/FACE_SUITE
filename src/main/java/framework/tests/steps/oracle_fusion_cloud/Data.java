package framework.tests.steps.oracle_fusion_cloud;

import java.util.Random;

public class Data extends framework.core.models.Data {

    // Alpha sorted list of models items (yes it will be long normally)
    private String actualAmount;
    private String addressLine1;
    private String addressLine2;
    private String altWorkLocationaddressType;
    private String altWorkLocationcountry;
    private String altWorkLocationaddressLine1;
    private String altWorkLocationzipCode;
    private String assignmentCategory;
    private String businessUnit;
    private String changeManagerReason;
    private String city;
    private String contactsEmergencyContactName;
    private String contactsRelationship;
    private String companyEntity;
    private String costCenter;
    private String country;
    private String countryCode;
    private String county;
    private String dateOfBirth;
    private String department;
    private String destinationLegalEmployer;
    private String effectiveAsOfDate;
    private String elementName;
    private String elementNameADP;
    private String employmentAction;
    private String employmentActionReason;
    private String employeeManagerChange;
    private String email;
    private String erProfitCenter;
    private String firstName;
    private String gender;
    private String globalMobilityIndicator;
    private boolean globalMobilityIndicatorCheck;
    private String grade;
    private String hireAction;
    private String hireDate;
    private String hireReason;
    private String hourlyPaidOrSalaried;
    private String job;
    private String lastName;
    private String legalEmployer;
    private String location;
    private String managerName;
    private String maritalStatus;
    private String nationalID;
    private String nationalIDType;
    private String newlySeparatedVeteranDischargeDate;
    private String number;
    private String password;
    private String payroll;
    private String pearsonEmailRequired;
    private String payCheckDate;
    private String personNumber;
    private String salaryAmount;
    private String salaryBasis;
    private String scenario;
    private String state;
    private String type1;
    private String type2;
    private String userName;
    private String veteranSelfIdentificationStatus;
    private String workerType;
    private String workingAsManager;
    private String zipCode;

    // Alpha sorted list of getters
    // most of these items get loaded via bean loader, so normally setters not needed.
    public String getActualAmount() {
        return actualAmount;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getAltWorkLocationaddressType() {
        return altWorkLocationaddressType;
    }

    public String getAltWorkLocationcountry() {
        return altWorkLocationcountry;
    }

    public String getAltWorkLocationaddressLine1() {
        return altWorkLocationaddressLine1;
    }

    public String getAltWorkLocationzipCode() {
        return altWorkLocationzipCode;
    }

    public String getAssignmentCategory() {
        return assignmentCategory;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public String getChangeManagerReason() {
        return changeManagerReason;
    }

    public String getCity() {
        return city;
    }

    public String getContactsEmergencyContactName() {
        return contactsEmergencyContactName;
    }

    public String getContactsRelationship() {
        return contactsRelationship;
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

    public String getDestinationLegalEmployer() {
        return destinationLegalEmployer;
    }

    public String geteffectiveAsOfDate() {
        return effectiveAsOfDate;
    }

    public String getEmail() {
        return email;
    }

    public String getEmployeeManagerChange() {
        return employeeManagerChange;
    }

    public String getErProfitCenter() {
        return erProfitCenter;
    }

    public String getElementName() {
        return elementName;
    }

    public String getElementNameADP() {
        return elementNameADP;
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

    public String getEmploymentAction() {
        return employmentAction;
    }

    public String getEmploymentActionReason() {
        return employmentActionReason;
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

    public String getGender() {
        return gender;
    }

    public String getGlobalMobilityIndicator() {
        return globalMobilityIndicator;
    }

    public boolean getGlobalMobilityIndicatorCheck() {
        return globalMobilityIndicatorCheck;
    }

    public void setGlobalMobilityIndicatorCheck(boolean globalMobilityIndicatorCheck) {
        this.globalMobilityIndicatorCheck = globalMobilityIndicatorCheck;
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
        return "LAUTO" + buffer.toString().toUpperCase();
    }

    public String getLegalEmployer() {
        return legalEmployer;
    }

    public String getLocation() {
        return location;
    }

    public String getManagerName() {
        return managerName;
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

    public String getNewlySeparatedVeteranDischargeDate() {
        return newlySeparatedVeteranDischargeDate;
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

    public String getPayCheckDate() {
        return payCheckDate;
    }

    public String getPearsonEmailRequired() {
        return pearsonEmailRequired;
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    public String getSalaryAmount() {
        return salaryAmount;
    }

    public String getSalaryBasis() {
        return salaryBasis;
    }

    public String getScenario() {
        return scenario;
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

    public String getWorkerType() {
        return workerType;
    }

    public String getWorkingAsManager() {
        return workingAsManager;
    }

    public String getZipCode() {
        return zipCode;
    }

}
