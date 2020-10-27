package com.yunionyun.mcp.mcclient.utils.pricespec;

public class InstanceDiskSpec {
	protected String resourceType;
	protected String diskType;
	protected int sizeGB;
	public InstanceDiskSpec(String diskType, int sizeGB) {
		this.resourceType = "disk";
		this.diskType = diskType;
		this.sizeGB = sizeGB;
	}
}
