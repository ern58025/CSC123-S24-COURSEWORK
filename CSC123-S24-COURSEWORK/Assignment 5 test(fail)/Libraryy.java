import java.util.ArrayList;
import java.util.List;
public class Libraryy 
{
	private List<Material> catalogue;
	private List<Memberss> members;
	
	public Libraryy()
	{
		catalogue = new ArrayList<>();
		members = new ArrayList<>();
	}
	public void addMaterial(Material material)
	{
		catalogue.add(material);
		System.out.println("Material added to catalogue.");
	}
	public void issueItem(String membershipID, String itemReference)
	{
		Material item = null;
		for(Material material : catalogue)
		{
			if(material.getItemReference().equals(itemReference))
			{
				item = material;
				break;
			}
		}
		if(item == null)
		{
			System.out.println("Item does not exist in the catalogue.");
			return;
		}
		if(!item.isAvailableForLoan())
		{
			System.out.println("Item is already on loan.");
			return;
		}
		item.setAvailableForLoan(false);
		item.setBorrowerMembershipID(membershipID);
		System.out.println("Item successfully issued to member with ID: membershipID");
	}
	public void returnItem(String itemReference)
	{
		boolean itemReturned = false;
		for(Material material : catalogue)
		{
			if(material.getItemReference().equals(itemReference))
			{
				if(!material.isAvialableForLoan())
				{
					material.setAviableForLoan(true);
					material.setBorrowerMembershipID(null);
					System.out.println("Item successfully returned.");
					itemReturned = true;
				}
				else
				{
					System.out.println("Item is already available.");
		
				}
				break;
			}
		}
		if(!itemReturned)
		{
			System.out.println("Item not found in the catalogue.");
		}
	}

}
