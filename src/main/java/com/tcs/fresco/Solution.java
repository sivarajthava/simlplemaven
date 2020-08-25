    package com.tcs.fresco;

import java.util.HashMap;
import java.util.Map;
public class Solution {
    
   public Map<Integer, String> customerTag = new HashMap<Integer, String>();

   public void saveCustomer(int custId, String custName) {
		customerTag.put(custId, custName);
   }
   public boolean isCustomerExist(String customerName) {
		boolean isExist = customerTag.containsValue(customerName);
		return isExist;
   }
  
}