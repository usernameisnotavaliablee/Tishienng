package com.bytedance.android.openliveplugin;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LiveLoadingDialog {
    private static android.app.Dialog loadingDialog;


    static {
            return
    }

    public LiveLoadingDialog() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.app.Dialog access$000() {
            android.app.Dialog r0 = com.bytedance.android.openliveplugin.LiveLoadingDialog.loadingDialog
            return r0
    }

    public static boolean dismiss() {
            android.app.Dialog r0 = com.bytedance.android.openliveplugin.LiveLoadingDialog.loadingDialog
            if (r0 == 0) goto L11
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L11
            android.app.Dialog r0 = com.bytedance.android.openliveplugin.LiveLoadingDialog.loadingDialog
            r0.dismiss()
            r0 = 1
            return r0
        L11:
            r0 = 0
            return r0
    }

    public static void show(android.app.Activity r4) {
            if (r4 != 0) goto L4
            goto L83
        L4:
            android.app.Dialog r0 = com.bytedance.android.openliveplugin.LiveLoadingDialog.loadingDialog
            if (r0 != 0) goto L78
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r4)
            r2 = 1
            r1.setCancelable(r2)
            android.view.LayoutInflater r4 = r4.getLayoutInflater()
            int r2 = com.bytedance.gromore.R.layout.live_init_progress_dialog
            r3 = 0
            android.view.View r4 = r4.inflate(r2, r3)
            int r2 = com.bytedance.gromore.R.id.live_progress_cancel
            android.view.View r2 = r4.findViewById(r2)
            com.bytedance.android.openliveplugin.LiveLoadingDialog$1 r3 = new com.bytedance.android.openliveplugin.LiveLoadingDialog$1
            r3.<init>()
            r2.setOnClickListener(r3)
            r1.setView(r4)
            android.app.AlertDialog r4 = r1.create()
            com.bytedance.android.openliveplugin.LiveLoadingDialog.loadingDialog = r4
            android.view.Window r4 = r4.getWindow()
            if (r4 == 0) goto L83
            android.app.Dialog r4 = com.bytedance.android.openliveplugin.LiveLoadingDialog.loadingDialog
            android.view.Window r4 = r4.getWindow()
            r1 = 17170445(0x106000d, float:2.461195E-38)
            r4.setBackgroundDrawableResource(r1)
            android.app.Dialog r4 = com.bytedance.android.openliveplugin.LiveLoadingDialog.loadingDialog
            android.view.Window r4 = r4.getWindow()
            r1 = 0
            r4.setDimAmount(r1)
            android.app.Dialog r4 = com.bytedance.android.openliveplugin.LiveLoadingDialog.loadingDialog
            r4.show()
            android.app.Dialog r4 = com.bytedance.android.openliveplugin.LiveLoadingDialog.loadingDialog
            android.view.Window r4 = r4.getWindow()
            r1 = 1119354880(0x42b80000, float:92.0)
            float r1 = r1 * r0
            int r1 = java.lang.Math.round(r1)
            r2 = 1117782016(0x42a00000, float:80.0)
            float r0 = r0 * r2
            int r0 = java.lang.Math.round(r0)
            r4.setLayout(r1, r0)
            return
        L78:
            boolean r4 = r0.isShowing()
            if (r4 != 0) goto L83
            android.app.Dialog r4 = com.bytedance.android.openliveplugin.LiveLoadingDialog.loadingDialog
            r4.show()
        L83:
            return
    }
}
