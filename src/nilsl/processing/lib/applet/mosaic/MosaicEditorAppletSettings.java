package nilsl.processing.lib.applet.mosaic;

import nilsl.processing.lib.applet.FilesaveAppletSettings;
import nilsl.processing.lib.twodim.drawers.mosaic.MosaicInfo;

public class MosaicEditorAppletSettings extends FilesaveAppletSettings {
	public MosaicInfo mosInfo;
	public MosaicEditorAppletSettings(MosaicInfo mosInfo)
	{
		this.mosInfo = mosInfo;
		width = mosInfo.xdim * mosInfo.imgSizeX;
		height = mosInfo.ydim * mosInfo.imgSizeY;
		this.mosInfo = mosInfo;
	}
}
