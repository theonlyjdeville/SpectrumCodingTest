package Refractored.Fab;


public class FloatingActionButton_MyOutlineProvider
	extends android.view.ViewOutlineProvider
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getOutline:(Landroid/view/View;Landroid/graphics/Outline;)V:GetGetOutline_Landroid_view_View_Landroid_graphics_Outline_Handler\n" +
			"";
		mono.android.Runtime.register ("Refractored.Fab.FloatingActionButton+MyOutlineProvider, Refractored.Fab, Version=2.1.0.0, Culture=neutral, PublicKeyToken=null", FloatingActionButton_MyOutlineProvider.class, __md_methods);
	}


	public FloatingActionButton_MyOutlineProvider ()
	{
		super ();
		if (getClass () == FloatingActionButton_MyOutlineProvider.class)
			mono.android.TypeManager.Activate ("Refractored.Fab.FloatingActionButton+MyOutlineProvider, Refractored.Fab, Version=2.1.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public FloatingActionButton_MyOutlineProvider (android.content.res.Resources p0, int p1)
	{
		super ();
		if (getClass () == FloatingActionButton_MyOutlineProvider.class)
			mono.android.TypeManager.Activate ("Refractored.Fab.FloatingActionButton+MyOutlineProvider, Refractored.Fab, Version=2.1.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Res.Resources, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Refractored.Fab.FabSize, Refractored.Fab, Version=2.1.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0, p1 });
	}


	public void getOutline (android.view.View p0, android.graphics.Outline p1)
	{
		n_getOutline (p0, p1);
	}

	private native void n_getOutline (android.view.View p0, android.graphics.Outline p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
