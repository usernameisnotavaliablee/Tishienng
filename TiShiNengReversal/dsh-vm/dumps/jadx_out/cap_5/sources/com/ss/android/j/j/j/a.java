package com.ss.android.j.j.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a implements v2.w {

    /* renamed from: com.ss.android.j.j.j.a$a, reason: collision with other inner class name */
    static class DialogInterfaceOnClickListenerC0223a implements android.content.DialogInterface.OnClickListener {
        final /* synthetic */ com.ss.android.j.j.up.a a;

        DialogInterfaceOnClickListenerC0223a(com.ss.android.j.j.up.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                com.ss.android.j.j.up.a r2 = r0.a
                com.ss.android.j.j.up.a$c r2 = r2.h
                if (r2 == 0) goto L9
                r2.xt(r1)
            L9:
                return
        }
    }

    static class b implements android.content.DialogInterface.OnClickListener {
        final /* synthetic */ com.ss.android.j.j.up.a a;

        b(com.ss.android.j.j.up.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                com.ss.android.j.j.up.a r2 = r0.a
                com.ss.android.j.j.up.a$c r2 = r2.h
                if (r2 == 0) goto L9
                r2.j(r1)
            L9:
                return
        }
    }

    static class c implements android.content.DialogInterface.OnCancelListener {
        final /* synthetic */ com.ss.android.j.j.up.a a;

        c(com.ss.android.j.j.up.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(android.content.DialogInterface r2) {
                r1 = this;
                com.ss.android.j.j.up.a r0 = r1.a
                com.ss.android.j.j.up.a$c r0 = r0.h
                if (r0 == 0) goto L9
                r0.cw(r2)
            L9:
                return
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.app.Dialog a(com.ss.android.j.j.up.a r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.content.Context r1 = r3.a
            r0.<init>(r1)
            java.lang.String r1 = r3.b
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            java.lang.String r1 = r3.c
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            java.lang.String r1 = r3.d
            com.ss.android.j.j.j.a$b r2 = new com.ss.android.j.j.j.a$b
            r2.<init>(r3)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            java.lang.String r1 = r3.e
            com.ss.android.j.j.j.a$a r2 = new com.ss.android.j.j.j.a$a
            r2.<init>(r3)
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            android.app.AlertDialog r0 = r0.show()
            boolean r1 = r3.f
            r0.setCanceledOnTouchOutside(r1)
            com.ss.android.j.j.j.a$c r1 = new com.ss.android.j.j.j.a$c
            r1.<init>(r3)
            r0.setOnCancelListener(r1)
            android.graphics.drawable.Drawable r3 = r3.g
            if (r3 == 0) goto L45
            r0.setIcon(r3)
        L45:
            return r0
    }

    public void j(int r1, @androidx.annotation.Nullable android.content.Context r2, com.ss.android.j.j.cw.b r3, java.lang.String r4, android.graphics.drawable.Drawable r5, int r6) {
            r0 = this;
            r1 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r2, r4, r1)
            r1.show()
            return
    }

    public android.app.Dialog xt(@androidx.annotation.NonNull com.ss.android.j.j.up.a r1) {
            r0 = this;
            android.app.Dialog r1 = a(r1)
            return r1
    }
}
