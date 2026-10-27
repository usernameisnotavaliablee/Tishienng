package com.bxkj.student.v2.ui.sports.v3.dxyy.ar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class ARActivity extends androidx.fragment.app.FragmentActivity {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.ui.sports.v3.dxyy.ar.ARActivity.a P = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String Q = null;

    @org.jetbrains.annotations.Nullable
    private com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView O;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            r0 = 18059(0x468b, float:2.5306E-41)
            com.stub.StubApp.interface11(r0)
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.ARActivity$a r0 = new com.bxkj.student.v2.ui.sports.v3.dxyy.ar.ARActivity$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.ARActivity.P = r0
            java.lang.String r0 = "uD7vNrwt9yqkS9CKYJsyTLzEBM9yyieJas3HTYgM2R28HN8AiBHITcddyByTHswfvU6KXNMc0wLfU54CnAzICo802Ra0G55VzFOeA5Qc2QGOGs9NxyTHTZ8K0guRGvULjl2GNKBTnhmcDdUOkwvPTcckngySEtEakxbIFt8ikE2NE90bmxDOAo5dhjTfCNUBmRDLHN9TngKcHJ4y0V3RAJkK0AqOXYY03wzZAY4akiaQHtsKqQ3dDJYW0gjfU54cmBHPCtM80ACIG+4KnhDbAZQL1QCTXZBNjhrSHJhR7gqeEM4LlBHbTdFdzwqTDNlBsh3WCp4L6B2cHNcGkxieQ98M2QGOGpI8iA3aDp4a6B2cHNcGkxieQ98M2QGOGpI8jR7OHJgszA6JFt0DsB7MTdFdzwqTDNlBsBDIBpIR6B2cHNcGkxieQ98M2QGOGpIrmBHPCq4P3RuUHtAinA+eQ98M2QGOGpIsvDvoHZwc1waTGJ4y0V3ZF40WzgqpFtEKrgvdAo1dhgGIE9BD3xbPI5Ic3QPfRdoOkQzZEtEEng2IEdgDmDbYHN9F502eENFBnwfXBdMMyBqZGtIb3yKQTYsezgacEcgc30XnTZ4Q0QKIEdUbhF3hQ98P0A6JGdMdkAyeVaZd3QGZDdMGmV3hQ98S0wuIE9kc30XnTY4a0hyYUfUCnBjZO48e3wSUEdtN0V3PCpMM2UG+E9MamS3ZDJIY0gaJFtMB31OeHJgRzwrTLdkMkg3YBpMYnkPfDNkBjhqSIJ8V2QyJK84OnhTVAZpdkE2OGtIcmFHvGo8Z3QyYK84OnhTVAZpdkE2OGtIcmFHvH5wNzwquD90blB7QIpwPnkPfDNkBjhqSIpIL1QCTK84OnhTVAZpdkE2OGtIcmFH4CpMM2TyNHsgGnBPxDo1dkE2OGtIcmFH/Lrkrzg6eFNUBml3hQ98axB+UDdk7lBLZPIke0R/fRdIakROQTZQM8ACeHtBNxxndA44awUOGXd4akxvQCrQbz03HJJ4MkhKSDZIH1wXTDMgamRrSG98ikE2LHs4GnBHIHN9F502eENECiBHVG4Rd4UPfD9AOiRnTHZAMnlWmXdUAjl3hQ98S0wuIE9kc30XnTY4a0hyYUfUCnBjZO48e3wSUEdtN0V3PCpMM2UG+E9MamS3ZDJIY0gaJFtMB31OeHJgRzwrTLdkMkg3YBpMYnkPfDNkBjhqSIJ8V2QyJK84OnhTVAZpdkE2OGtIcmFHvGo8Z3QyYK84OnhTVAZpdkE2OGtIcmFHvH5wNzwquD90blB7QIpwPnkPfDNkBjhqSIpIL1QCTK84OnhTVAZpdkE2OGtIcmFH4CpMM2TyNHsgGnBPxDo1dkE2OGtIcmFH/Lrkrzg6eFNUBml3hQ98axB+UDdk7lBLZPIke0R/fRdIakROQTZQM8ACeHtBNxxndA44awTKAM5il3RnAwbuRqFoAO4smo6vu4zvvbHq9X0nqmzTysQ1Bt0i8rCUNhzqS1glH/rJ32ov7fit60pH3SCRDJwBndJAyZz9xXB7NogNmtIrmKbRyE6N67UrtqJKsIJrePiecA0c3eKwJeRiE6vUXno2p5tOD0HJsbqdee9g4eMJ4bxPwPkc2U2RVuoCkjbnvULszXDCznPSIRRy7+P1NYC1TOwlAQcuoY+EimZWWuqWhs+0SGhb2v3LgEnWYX90gkHAI/xQ59IUxnz4BvppKa7b8xcRy6d03OhzzDI8Q2ekXFMRiBtjs2+MUgf8te4PjTCrPCtBIRIBrPWfwhUWJ/X+8bw=="
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.ARActivity.Q = r0
            return
    }

    public ARActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ kotlin.n1 e(com.bxkj.student.v2.ui.sports.v3.dxyy.ar.ARActivity r0) {
            kotlin.n1 r0 = f(r0)
            return r0
    }

    private static final kotlin.n1 f(com.bxkj.student.v2.ui.sports.v3.dxyy.ar.ARActivity r3) {
            r0 = 2131298322(0x7f090812, float:1.8214614E38)
            android.view.View r0 = r3.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r3 = r3.O
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r0.addView(r3, r1)
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    public void onBackPressed() {
            r1 = this;
            r0 = -1
            r1.setResult(r0)
            super/*androidx.activity.ComponentActivity*/.onBackPressed()
            return
    }

    protected native void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r1);

    protected void onPause() {
            r1 = this;
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r0 = r1.O
            if (r0 == 0) goto L7
            r0.onPause()
        L7:
            super.onPause()
            return
    }

    protected void onResume() {
            r1 = this;
            super.onResume()
            com.bxkj.student.v2.ui.sports.v3.dxyy.ar.helloar.GLView r0 = r1.O
            if (r0 == 0) goto La
            r0.onResume()
        La:
            return
    }
}
