package ecologylab.appframework.macos;

import com.apple.eawt.Application;
import com.apple.eawt.ApplicationEvent;
import com.apple.eawt.ApplicationListener;

import ecologylab.appframework.MacOSAppHandler;
import ecologylab.generic.Debug;

public class MacOSApp extends Application implements ApplicationListener
{
	MacOSAppHandler	macOSAppHandler;
	
	static MacOSApp singleton;
	
	public MacOSApp()
	{
		addApplicationListener(this);
	}

	public MacOSApp(MacOSAppHandler macOSAppHandler)
	{
		this();
		this.macOSAppHandler	= macOSAppHandler;
	}
	
	public static void addListener(MacOSAppHandler macOSAppHandler)
	{
		if (singleton == null)
		{
			singleton	= new MacOSApp(macOSAppHandler);
		}
	}

	public void handleAbout(ApplicationEvent arg0)
	{
		if (macOSAppHandler != null)
			macOSAppHandler.handleAbout();
	}

	public void handleOpenApplication(ApplicationEvent arg0)
	{
		if (macOSAppHandler != null)
			this.macOSAppHandler.handleOpenApplication();
	}

	public void handleOpenFile(ApplicationEvent arg0)
	{
		if (macOSAppHandler != null)
			this.macOSAppHandler.handleOpenFile(arg0.getFilename());
	}

	public void handlePreferences(ApplicationEvent arg0)
	{
		if (macOSAppHandler != null)
			this.macOSAppHandler.handlePreferences();
	}

	public void handlePrintFile(ApplicationEvent arg0)
	{
		if (macOSAppHandler != null)
			this.macOSAppHandler.handlePrintFile(arg0.getFilename());
	}

	public void handleQuit(ApplicationEvent arg0)
	{
		Debug.println("YO! handleQuit()");
		if (macOSAppHandler != null)
			this.macOSAppHandler.handleQuit();
	}

	public void handleReOpenApplication(ApplicationEvent arg0)
	{
		if (macOSAppHandler != null)
			this.macOSAppHandler.handleReOpenApplication();
	}
}
