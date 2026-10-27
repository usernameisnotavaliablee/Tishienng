package com.bxkj.student.run.app.face.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a extends android.app.Dialog {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bxkj.student.run.app.face.widget.a$a, reason: collision with other inner class name */
    public static class C0131a {
        private android.content.Context a;
        private java.lang.String b;
        private java.lang.String c;
        private java.lang.String d;
        private android.content.DialogInterface.OnClickListener e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bxkj.student.run.app.face.widget.a$a$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0132a implements android.view.View.OnClickListener {
            final /* synthetic */ com.bxkj.student.run.app.face.widget.a a;
            final /* synthetic */ com.bxkj.student.run.app.face.widget.a.C0131a b;

            ViewOnClickListenerC0132a(com.bxkj.student.run.app.face.widget.a.C0131a r1, com.bxkj.student.run.app.face.widget.a r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r3) {
                    r2 = this;
                    com.bxkj.student.run.app.face.widget.a$a r3 = r2.b
                    android.content.DialogInterface$OnClickListener r3 = com.bxkj.student.run.app.face.widget.a.C0131a.a(r3)
                    com.bxkj.student.run.app.face.widget.a r0 = r2.a
                    r1 = -2
                    r3.onClick(r0, r1)
                    return
            }
        }

        public C0131a(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        static /* bridge */ /* synthetic */ android.content.DialogInterface.OnClickListener a(com.bxkj.student.run.app.face.widget.a.C0131a r0) {
                android.content.DialogInterface$OnClickListener r0 = r0.e
                return r0
        }

        public com.bxkj.student.run.app.face.widget.a b() {
                r5 = this;
                android.content.Context r0 = r5.a
                java.lang.String r1 = "layout_inflater"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
                com.bxkj.student.run.app.face.widget.a r1 = new com.bxkj.student.run.app.face.widget.a
                android.content.Context r2 = r5.a
                r3 = 2132017470(0x7f14013e, float:1.967322E38)
                r1.<init>(r2, r3)
                r2 = 2131493746(0x7f0c0372, float:1.861098E38)
                r3 = 0
                android.view.View r0 = r0.inflate(r2, r3)
                android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
                r3 = -2
                r2.<init>(r3, r3)
                r1.addContentView(r0, r2)
                r2 = 2131296867(0x7f090263, float:1.8211663E38)
                android.view.View r2 = r0.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                java.lang.String r3 = r5.b
                r2.setText(r3)
                java.lang.String r2 = r5.d
                r3 = 2131296860(0x7f09025c, float:1.8211649E38)
                if (r2 == 0) goto L56
                android.view.View r2 = r0.findViewById(r3)
                android.widget.TextView r2 = (android.widget.TextView) r2
                java.lang.String r4 = r5.d
                r2.setText(r4)
                android.content.DialogInterface$OnClickListener r2 = r5.e
                if (r2 == 0) goto L5f
                android.view.View r2 = r0.findViewById(r3)
                com.bxkj.student.run.app.face.widget.a$a$a r3 = new com.bxkj.student.run.app.face.widget.a$a$a
                r3.<init>(r5, r1)
                r2.setOnClickListener(r3)
                goto L5f
            L56:
                android.view.View r2 = r0.findViewById(r3)
                r3 = 8
                r2.setVisibility(r3)
            L5f:
                java.lang.String r2 = r5.c
                if (r2 == 0) goto L71
                r2 = 2131296862(0x7f09025e, float:1.8211653E38)
                android.view.View r2 = r0.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                java.lang.String r3 = r5.c
                r2.setText(r3)
            L71:
                r1.setContentView(r0)
                return r1
        }

        public com.bxkj.student.run.app.face.widget.a.C0131a c(int r2) {
                r1 = this;
                android.content.Context r0 = r1.a
                java.lang.CharSequence r2 = r0.getText(r2)
                java.lang.String r2 = (java.lang.String) r2
                r1.c = r2
                return r1
        }

        public com.bxkj.student.run.app.face.widget.a.C0131a d(java.lang.String r1) {
                r0 = this;
                r0.c = r1
                return r0
        }

        public com.bxkj.student.run.app.face.widget.a.C0131a e(int r2, android.content.DialogInterface.OnClickListener r3) {
                r1 = this;
                android.content.Context r0 = r1.a
                java.lang.CharSequence r2 = r0.getText(r2)
                java.lang.String r2 = (java.lang.String) r2
                r1.d = r2
                r1.e = r3
                return r1
        }

        public com.bxkj.student.run.app.face.widget.a.C0131a f(java.lang.String r1, android.content.DialogInterface.OnClickListener r2) {
                r0 = this;
                r0.d = r1
                r0.e = r2
                return r0
        }

        public com.bxkj.student.run.app.face.widget.a.C0131a g(int r2) {
                r1 = this;
                android.content.Context r0 = r1.a
                java.lang.CharSequence r2 = r0.getText(r2)
                java.lang.String r2 = (java.lang.String) r2
                r1.b = r2
                return r1
        }

        public com.bxkj.student.run.app.face.widget.a.C0131a h(java.lang.String r1) {
                r0 = this;
                r0.b = r1
                return r0
        }
    }

    public a(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public a(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }
}
