package us.ihmc.etherCAT.slaves.omron;

import us.ihmc.etherCAT.master.Slave;

public class OmronGXJC03 extends Slave
{
   
   static final int vendorID = 0x00000083;
   static final int productCode = 0x0000007c;

   public OmronGXJC03(int aliasAddress, int configAddress)
   {
      super(vendorID, productCode, aliasAddress, configAddress);
   }

}
