class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // Initialize totalGas and totalCost to 0
        int totalGas = 0, totalCost =0;
        // Iterate through all the gas stations
        for(int i =0;i<gas.length;i++){
            // Add the gas and cost at each station to the total
            totalGas += gas[i];
            totalCost += cost[i];
        }
        // If totalGas is lesser than totalCost, it is not possible to complete the circuit
        if(totalGas < totalCost)  return -1;
        
        // Initialize tankMesGas and start to 0
        int start =0;
        int tankMeGas =0;
        // Iterate through all the gas stations
        for(int i=0 ; i < gas.length ; i++){
            // Add the difference between gas and cost at each station to tankMeGas
            tankMeGas += gas[i];
            tankMeGas -= cost[i];
            // If tankmeGas becomes negative, set start to the next station and reset remainsGas to 0
            if(tankMeGas < 0){
                start = i + 1;
                tankMeGas =0;
            }   
        }
        // Return the starting station
        return start;
    }
}