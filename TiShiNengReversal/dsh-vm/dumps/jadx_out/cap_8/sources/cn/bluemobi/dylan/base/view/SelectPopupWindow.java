package cn.bluemobi.dylan.base.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SelectPopupWindow extends android.widget.PopupWindow {
    private android.content.Context context;
    private android.widget.ListAdapter listAdapter;
    private android.widget.ListView listView;
    private android.widget.FrameLayout outsideView;
    private android.widget.PopupWindow popupWindow;
    private android.view.View showAsDropDownView;



    public SelectPopupWindow(android.view.View r1, android.widget.ListAdapter r2, android.widget.FrameLayout r3) {
            r0 = this;
            r0.<init>()
            r0.showAsDropDownView = r1
            android.content.Context r1 = r1.getContext()
            r0.context = r1
            r0.listAdapter = r2
            r0.outsideView = r3
            r0.init()
            return
    }

    static /* synthetic */ android.widget.FrameLayout access$000(cn.bluemobi.dylan.base.view.SelectPopupWindow r0) {
            android.widget.FrameLayout r0 = r0.outsideView
            return r0
    }

    static /* synthetic */ android.widget.PopupWindow access$100(cn.bluemobi.dylan.base.view.SelectPopupWindow r0) {
            android.widget.PopupWindow r0 = r0.popupWindow
            return r0
    }

    private void init() {
            r5 = this;
            android.widget.PopupWindow r0 = new android.widget.PopupWindow
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            r5.popupWindow = r0
            android.widget.ListView r0 = new android.widget.ListView
            android.content.Context r3 = r5.context
            r0.<init>(r3)
            r5.listView = r0
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r1, r2)
            r0.setLayoutParams(r3)
            android.widget.ListView r0 = r5.listView
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            android.content.Context r3 = r5.context
            android.content.res.Resources r3 = r3.getResources()
            r4 = 17170432(0x1060000, float:2.4611913E-38)
            int r3 = r3.getColor(r4)
            r2.<init>(r3)
            r0.setDivider(r2)
            android.widget.ListView r0 = r5.listView
            r2 = 1065353216(0x3f800000, float:1.0)
            android.content.Context r3 = r5.context
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r2, r3)
            r0.setDividerHeight(r2)
            android.widget.ListView r0 = r5.listView
            r0.setBackgroundColor(r1)
            android.widget.ListView r0 = r5.listView
            android.widget.ListAdapter r1 = r5.listAdapter
            r0.setAdapter(r1)
            r0 = 0
            r5.setOnItemClickListener(r0)
            android.widget.PopupWindow r0 = r5.popupWindow
            android.widget.ListView r1 = r5.listView
            r0.setContentView(r1)
            android.widget.PopupWindow r0 = r5.popupWindow
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            r1.<init>()
            r0.setBackgroundDrawable(r1)
            android.widget.PopupWindow r0 = r5.popupWindow
            r1 = 1
            r0.setOutsideTouchable(r1)
            android.widget.PopupWindow r0 = r5.popupWindow
            r0.setFocusable(r1)
            android.widget.PopupWindow r0 = r5.popupWindow
            cn.bluemobi.dylan.base.view.SelectPopupWindow$1 r1 = new cn.bluemobi.dylan.base.view.SelectPopupWindow$1
            r1.<init>(r5)
            r0.setOnDismissListener(r1)
            return
    }

    public android.widget.ListView getListView() {
            r1 = this;
            android.widget.ListView r0 = r1.listView
            return r0
    }

    public cn.bluemobi.dylan.base.view.SelectPopupWindow setOnItemClickListener(android.widget.AdapterView.OnItemClickListener r3) {
            r2 = this;
            android.widget.PopupWindow r0 = r2.popupWindow
            if (r0 != 0) goto L5
            goto L9
        L5:
            android.widget.ListView r0 = r2.listView
            if (r0 != 0) goto La
        L9:
            return r2
        La:
            cn.bluemobi.dylan.base.view.SelectPopupWindow$2 r1 = new cn.bluemobi.dylan.base.view.SelectPopupWindow$2
            r1.<init>(r2, r3)
            r0.setOnItemClickListener(r1)
            return r2
    }

    public cn.bluemobi.dylan.base.view.SelectPopupWindow show() {
            r3 = this;
            android.widget.PopupWindow r0 = r3.popupWindow
            if (r0 != 0) goto L7
            r3.init()
        L7:
            android.widget.PopupWindow r0 = r3.popupWindow
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L28
            android.widget.PopupWindow r0 = r3.popupWindow
            android.view.View r1 = r3.showAsDropDownView
            r0.showAsDropDown(r1)
            android.widget.FrameLayout r0 = r3.outsideView
            if (r0 == 0) goto L28
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            java.lang.String r2 = "#7F4c4c4c"
            int r2 = android.graphics.Color.parseColor(r2)
            r1.<init>(r2)
            r0.setForeground(r1)
        L28:
            return r3
    }
}
