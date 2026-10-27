package com.kwad.components.core.page;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.kwad.sdk.api.core.KsAdSdkDynamicImpl(com.kwad.sdk.api.proxy.app.AdWebViewActivity.class)
@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class AdWebViewActivityProxy extends com.kwad.components.core.proxy.f {
    public static final java.lang.String KEY_AD_RESULT_CACHE_IDX = "key_ad_result_cache_idx";
    private static final java.lang.String KEY_IS_AUTO_SHOW = "key_is_auto_show";
    private static final java.lang.String KEY_LANDING_PAGE_TYPE = "key_landing_page_type";
    private static final java.lang.String KEY_PAGE_TITLE = "key_page_title";
    private static final java.lang.String KEY_PAGE_URL = "key_page_url";
    private static final java.lang.String KEY_SHOW_PERMISSION = "key_show_permission";
    private static final java.lang.String KEY_SHOW_TK_CONFIRM_DIALOG = "key_show_tk_confirm_dialog";
    public static final java.lang.String KEY_TEMPLATE = "key_template_json";
    private volatile boolean destroyed;
    private com.kwad.sdk.core.response.model.AdResultData mAdResultData;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private boolean mAutoShow;
    private com.kwad.components.core.webview.tachikoma.f.c mBaseDialogListener;
    private com.kwad.components.core.r.b mDialogFragment;
    private boolean mDisableShowConfirmDialog;
    private boolean mHasShowShowConfirmDialog;
    private android.app.Dialog mKsExitInterceptDialog;
    private android.app.Dialog mKsExitInterceptDialogV2;
    private com.kwad.components.core.page.a.a mLandPageViewListener;
    private int mLandingPageType;
    private com.kwad.components.core.page.c mLandingPageView;
    private java.lang.String mPageTitle;
    private java.lang.String mPageUrl;
    private boolean mShowPermission;
    private com.kwad.sdk.core.webview.d.a.b mWebCardCloseListener;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private java.lang.String Tj;
        private java.lang.String Tk;
        private com.kwad.sdk.core.response.model.AdResultData Tl;
        private boolean Tm;
        private boolean Tn;
        private int To;
        private boolean Tp;
        private com.kwad.sdk.core.response.model.AdTemplate adTemplate;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.kwad.components.core.page.AdWebViewActivityProxy$a$a, reason: collision with other inner class name */
        public static class C0084a {
            private java.lang.String Tj;
            private java.lang.String Tk;
            private com.kwad.sdk.core.response.model.AdResultData Tl;
            private boolean Tn;
            private int To;
            private boolean Tp;
            private boolean Tq;
            private com.kwad.sdk.core.response.model.AdTemplate adTemplate;

            public C0084a() {
                    r1 = this;
                    r1.<init>()
                    r0 = 0
                    r1.To = r0
                    return
            }

            public final com.kwad.components.core.page.AdWebViewActivityProxy.a.C0084a aA(java.lang.String r1) {
                    r0 = this;
                    r0.Tk = r1
                    return r0
            }

            public final com.kwad.components.core.page.AdWebViewActivityProxy.a.C0084a aD(com.kwad.sdk.core.response.model.AdTemplate r1) {
                    r0 = this;
                    r0.adTemplate = r1
                    return r0
            }

            public final com.kwad.components.core.page.AdWebViewActivityProxy.a.C0084a aF(boolean r1) {
                    r0 = this;
                    r0.Tq = r1
                    return r0
            }

            public final com.kwad.components.core.page.AdWebViewActivityProxy.a.C0084a aG(boolean r1) {
                    r0 = this;
                    r0.Tn = r1
                    return r0
            }

            public final com.kwad.components.core.page.AdWebViewActivityProxy.a.C0084a aH(boolean r1) {
                    r0 = this;
                    r0.Tp = r1
                    return r0
            }

            public final com.kwad.components.core.page.AdWebViewActivityProxy.a.C0084a aO(int r1) {
                    r0 = this;
                    r0.To = r1
                    return r0
            }

            public final com.kwad.components.core.page.AdWebViewActivityProxy.a.C0084a az(java.lang.String r1) {
                    r0 = this;
                    r0.Tj = r1
                    return r0
            }

            public final com.kwad.components.core.page.AdWebViewActivityProxy.a.C0084a q(com.kwad.sdk.core.response.model.AdResultData r1) {
                    r0 = this;
                    r0.Tl = r1
                    return r0
            }

            public final com.kwad.components.core.page.AdWebViewActivityProxy.a qW() {
                    r10 = this;
                    com.kwad.sdk.core.response.model.AdResultData r3 = r10.Tl
                    if (r3 == 0) goto L17
                    com.kwad.components.core.page.AdWebViewActivityProxy$a r0 = new com.kwad.components.core.page.AdWebViewActivityProxy$a
                    java.lang.String r1 = r10.Tj
                    java.lang.String r2 = r10.Tk
                    boolean r4 = r10.Tq
                    boolean r5 = r10.Tn
                    boolean r6 = r10.Tp
                    int r7 = r10.To
                    r8 = 0
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return r0
                L17:
                    com.kwad.components.core.page.AdWebViewActivityProxy$a r1 = new com.kwad.components.core.page.AdWebViewActivityProxy$a
                    java.lang.String r2 = r10.Tj
                    java.lang.String r3 = r10.Tk
                    com.kwad.sdk.core.response.model.AdTemplate r4 = r10.adTemplate
                    boolean r5 = r10.Tq
                    boolean r6 = r10.Tn
                    boolean r7 = r10.Tp
                    int r8 = r10.To
                    r9 = 0
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                    return r1
            }
        }

        private a(java.lang.String r8, java.lang.String r9, com.kwad.sdk.core.response.model.AdResultData r10, boolean r11, boolean r12, boolean r13, int r14) {
                r7 = this;
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r11
                r4 = r12
                r5 = r13
                r6 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r0.Tl = r10
                com.kwad.sdk.core.response.model.AdTemplate r8 = com.kwad.sdk.core.response.b.c.r(r10)
                r0.adTemplate = r8
                return
        }

        /* synthetic */ a(java.lang.String r1, java.lang.String r2, com.kwad.sdk.core.response.model.AdResultData r3, boolean r4, boolean r5, boolean r6, int r7, byte r8) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        private a(java.lang.String r8, java.lang.String r9, com.kwad.sdk.core.response.model.AdTemplate r10, boolean r11, boolean r12, boolean r13, int r14) {
                r7 = this;
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r11
                r4 = r12
                r5 = r13
                r6 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r0.adTemplate = r10
                return
        }

        /* synthetic */ a(java.lang.String r1, java.lang.String r2, com.kwad.sdk.core.response.model.AdTemplate r3, boolean r4, boolean r5, boolean r6, int r7, byte r8) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        private a(java.lang.String r1, java.lang.String r2, boolean r3, boolean r4, boolean r5, int r6) {
                r0 = this;
                r0.<init>()
                r0.Tj = r1
                r0.Tk = r2
                r0.Tm = r3
                r0.Tn = r4
                r0.Tp = r5
                r0.To = r6
                return
        }

        static /* synthetic */ java.lang.String a(com.kwad.components.core.page.AdWebViewActivityProxy.a r0) {
                java.lang.String r0 = r0.Tk
                return r0
        }

        static /* synthetic */ java.lang.String b(com.kwad.components.core.page.AdWebViewActivityProxy.a r0) {
                java.lang.String r0 = r0.Tj
                return r0
        }

        static /* synthetic */ int c(com.kwad.components.core.page.AdWebViewActivityProxy.a r0) {
                int r0 = r0.To
                return r0
        }

        static /* synthetic */ boolean d(com.kwad.components.core.page.AdWebViewActivityProxy.a r0) {
                boolean r0 = r0.Tn
                return r0
        }

        static /* synthetic */ boolean e(com.kwad.components.core.page.AdWebViewActivityProxy.a r0) {
                boolean r0 = r0.Tm
                return r0
        }

        static /* synthetic */ com.kwad.sdk.core.response.model.AdResultData f(com.kwad.components.core.page.AdWebViewActivityProxy.a r0) {
                com.kwad.sdk.core.response.model.AdResultData r0 = r0.Tl
                return r0
        }

        static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate g(com.kwad.components.core.page.AdWebViewActivityProxy.a r0) {
                com.kwad.sdk.core.response.model.AdTemplate r0 = r0.adTemplate
                return r0
        }

        public final com.kwad.sdk.core.response.model.AdTemplate getAdTemplate() {
                r1 = this;
                com.kwad.sdk.core.response.model.AdTemplate r0 = r1.adTemplate
                return r0
        }

        public final java.lang.String qQ() {
                r1 = this;
                java.lang.String r0 = r1.Tj
                return r0
        }

        public final java.lang.String qR() {
                r1 = this;
                java.lang.String r0 = r1.Tk
                return r0
        }

        public final int qS() {
                r1 = this;
                int r0 = r1.To
                return r0
        }

        public final boolean qT() {
                r1 = this;
                boolean r0 = r1.Tm
                return r0
        }

        public final boolean qU() {
                r1 = this;
                boolean r0 = r1.Tp
                return r0
        }

        public final boolean qV() {
                r1 = this;
                boolean r0 = r1.Tn
                return r0
        }
    }

    public AdWebViewActivityProxy() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.destroyed = r0
            com.kwad.components.core.page.AdWebViewActivityProxy$1 r0 = new com.kwad.components.core.page.AdWebViewActivityProxy$1
            r0.<init>(r1)
            r1.mWebCardCloseListener = r0
            com.kwad.components.core.page.AdWebViewActivityProxy$2 r0 = new com.kwad.components.core.page.AdWebViewActivityProxy$2
            r0.<init>(r1)
            r1.mLandPageViewListener = r0
            com.kwad.components.core.page.AdWebViewActivityProxy$3 r0 = new com.kwad.components.core.page.AdWebViewActivityProxy$3
            r0.<init>(r1)
            r1.mBaseDialogListener = r0
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate access$1000(com.kwad.components.core.page.AdWebViewActivityProxy r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.core.r.b access$1100(com.kwad.components.core.page.AdWebViewActivityProxy r0) {
            com.kwad.components.core.r.b r0 = r0.mDialogFragment
            return r0
    }

    static /* synthetic */ com.kwad.components.core.r.b access$1102(com.kwad.components.core.page.AdWebViewActivityProxy r0, com.kwad.components.core.r.b r1) {
            r0.mDialogFragment = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.r.b access$1200(com.kwad.components.core.page.AdWebViewActivityProxy r0) {
            com.kwad.components.core.r.b r0 = r0.getTkDialogFragment()
            return r0
    }

    static /* synthetic */ com.kwad.components.core.webview.tachikoma.f.c access$1300(com.kwad.components.core.page.AdWebViewActivityProxy r0) {
            com.kwad.components.core.webview.tachikoma.f.c r0 = r0.mBaseDialogListener
            return r0
    }

    static /* synthetic */ boolean access$1400(com.kwad.components.core.page.AdWebViewActivityProxy r0) {
            boolean r0 = r0.isFormAdExitInterceptEnable()
            return r0
    }

    static /* synthetic */ void access$1500(com.kwad.components.core.page.AdWebViewActivityProxy r0) {
            r0.showDialog()
            return
    }

    static /* synthetic */ boolean access$1600(com.kwad.components.core.page.AdWebViewActivityProxy r0) {
            boolean r0 = r0.destroyed
            return r0
    }

    static /* synthetic */ void access$1701(com.kwad.components.core.page.AdWebViewActivityProxy r0) {
            super.onBackPressed()
            return
    }

    static /* synthetic */ void access$1801(com.kwad.components.core.page.AdWebViewActivityProxy r0) {
            super.onBackPressed()
            return
    }

    static /* synthetic */ void access$1901(com.kwad.components.core.page.AdWebViewActivityProxy r0) {
            super.onBackPressed()
            return
    }

    static /* synthetic */ com.kwad.components.core.page.c access$700(com.kwad.components.core.page.AdWebViewActivityProxy r0) {
            com.kwad.components.core.page.c r0 = r0.mLandingPageView
            return r0
    }

    static /* synthetic */ boolean access$800(com.kwad.components.core.page.AdWebViewActivityProxy r0) {
            boolean r0 = r0.mDisableShowConfirmDialog
            return r0
    }

    static /* synthetic */ boolean access$900(com.kwad.components.core.page.AdWebViewActivityProxy r0) {
            boolean r0 = r0.handleMiddlePageDialog()
            return r0
    }

    private com.kwad.components.core.page.widget.a buildDialog() {
            r3 = this;
            com.kwad.components.core.page.widget.a r0 = new com.kwad.components.core.page.widget.a
            android.app.Activity r1 = r3.getActivity()
            com.kwad.components.core.page.AdWebViewActivityProxy$5 r2 = new com.kwad.components.core.page.AdWebViewActivityProxy$5
            r2.<init>(r3)
            r0.<init>(r1, r2)
            return r0
    }

    private com.kwad.components.core.r.b getTkDialogFragment() {
            r2 = this;
            com.kwad.components.core.webview.tachikoma.d.e$b r0 = new com.kwad.components.core.webview.tachikoma.d.e$b
            r0.<init>()
            com.kwad.sdk.core.response.model.AdResultData r1 = r2.mAdResultData
            r0.a(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            java.lang.String r1 = com.kwad.sdk.core.response.b.b.dQ(r1)
            r0.bg(r1)
            r1 = 0
            r0.aZ(r1)
            r1 = 1
            r0.ba(r1)
            com.kwad.components.core.r.b r0 = com.kwad.components.core.r.b.a(r0)
            return r0
    }

    private boolean handleMiddlePageDialog() {
            r4 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = com.kwad.sdk.core.config.e.Fq()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.cn(r0)
            boolean r0 = com.kwad.sdk.utils.bp.isNullString(r0)
            if (r0 != 0) goto L40
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.a.cm(r0)
            if (r0 == 0) goto L40
            boolean r0 = r4.mHasShowShowConfirmDialog
            r1 = 1
            if (r0 == 0) goto L2f
            access$1801(r4)     // Catch: java.lang.Throwable -> L2a
            goto L40
        L2a:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r0)
            goto L40
        L2f:
            com.kwad.components.core.r.b r0 = r4.getTkDialogFragment()
            r4.mDialogFragment = r0
            android.app.Activity r2 = r4.getActivity()
            com.kwad.components.core.webview.tachikoma.f.c r3 = r4.mBaseDialogListener
            com.kwad.components.core.r.b.a(r0, r2, r3)
            r4.mHasShowShowConfirmDialog = r1
        L40:
            return r1
    }

    private void initContentView() {
            r3 = this;
            int r0 = com.kwad.sdk.R.id.ksad_land_page_root
            android.view.View r0 = r3.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.kwad.components.core.page.AdWebViewActivityProxy$a$a r1 = new com.kwad.components.core.page.AdWebViewActivityProxy$a$a
            r1.<init>()
            java.lang.String r2 = r3.mPageTitle
            com.kwad.components.core.page.AdWebViewActivityProxy$a$a r1 = r1.az(r2)
            java.lang.String r2 = r3.mPageUrl
            com.kwad.components.core.page.AdWebViewActivityProxy$a$a r1 = r1.aA(r2)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
            com.kwad.components.core.page.AdWebViewActivityProxy$a$a r1 = r1.aD(r2)
            boolean r2 = r3.mShowPermission
            com.kwad.components.core.page.AdWebViewActivityProxy$a$a r1 = r1.aF(r2)
            boolean r2 = r3.mAutoShow
            com.kwad.components.core.page.AdWebViewActivityProxy$a$a r1 = r1.aG(r2)
            int r2 = r3.mLandingPageType
            com.kwad.components.core.page.AdWebViewActivityProxy$a$a r1 = r1.aO(r2)
            boolean r2 = r3.mDisableShowConfirmDialog
            com.kwad.components.core.page.AdWebViewActivityProxy$a$a r1 = r1.aH(r2)
            com.kwad.components.core.page.AdWebViewActivityProxy$a r1 = r1.qW()
            android.content.Context r2 = r3.mContext
            com.kwad.components.core.page.c r1 = com.kwad.components.core.page.c.a(r2, r1)
            r3.mLandingPageView = r1
            com.kwad.components.core.page.a.a r2 = r3.mLandPageViewListener
            r1.setLandPageViewListener(r2)
            com.kwad.components.core.page.c r1 = r3.mLandingPageView
            com.kwad.sdk.core.webview.d.a.b r2 = r3.mWebCardCloseListener
            r1.setWebCardCloseListener(r2)
            com.kwad.components.core.page.c r1 = r3.mLandingPageView
            r0.addView(r1)
            return
    }

    private boolean isFormAdExitInterceptEnable() {
            r3 = this;
            boolean r0 = r3.mShowPermission
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            if (r0 != 0) goto Lb
            return r1
        Lb:
            boolean r0 = com.kwad.sdk.core.response.b.e.O(r0)
            if (r0 == 0) goto L12
            return r1
        L12:
            boolean r0 = com.kwad.sdk.core.config.e.Fy()
            r2 = 1
            if (r0 == 0) goto L20
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            boolean r0 = r0.mIsFromContent
            if (r0 == 0) goto L20
            return r2
        L20:
            boolean r0 = com.kwad.sdk.core.config.e.Fz()
            if (r0 == 0) goto L2d
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            boolean r0 = r0.mIsFromContent
            if (r0 != 0) goto L2d
            return r2
        L2d:
            return r1
    }

    public static void launch(android.content.Context r4, com.kwad.components.core.page.AdWebViewActivityProxy.a r5) {
            java.lang.Class<com.kwad.sdk.api.proxy.app.AdWebViewActivity> r0 = com.kwad.sdk.api.proxy.app.AdWebViewActivity.class
            if (r4 == 0) goto Lab
            java.lang.String r1 = com.kwad.components.core.page.AdWebViewActivityProxy.a.a(r5)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L10
            goto Lab
        L10:
            com.kwad.sdk.core.response.model.AdTemplate r1 = r5.getAdTemplate()     // Catch: java.lang.Throwable -> L73
            int r2 = r5.qS()     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = r5.qR()     // Catch: java.lang.Throwable -> L73
            com.kwad.sdk.commercial.g.a.j(r1, r2, r3)     // Catch: java.lang.Throwable -> L73
            java.lang.Class<com.kwad.components.core.page.AdWebViewActivityProxy> r1 = com.kwad.components.core.page.AdWebViewActivityProxy.class
            com.kwad.sdk.service.c.a(r0, r1)     // Catch: java.lang.Throwable -> L73
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L73
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L73
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r1.addFlags(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "key_page_title"
            java.lang.String r2 = com.kwad.components.core.page.AdWebViewActivityProxy.a.b(r5)     // Catch: java.lang.Throwable -> L73
            r1.putExtra(r0, r2)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "key_landing_page_type"
            int r2 = com.kwad.components.core.page.AdWebViewActivityProxy.a.c(r5)     // Catch: java.lang.Throwable -> L73
            r1.putExtra(r0, r2)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "key_page_url"
            java.lang.String r2 = com.kwad.components.core.page.AdWebViewActivityProxy.a.a(r5)     // Catch: java.lang.Throwable -> L73
            r1.putExtra(r0, r2)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "key_is_auto_show"
            boolean r2 = com.kwad.components.core.page.AdWebViewActivityProxy.a.d(r5)     // Catch: java.lang.Throwable -> L73
            r1.putExtra(r0, r2)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "key_show_permission"
            boolean r2 = com.kwad.components.core.page.AdWebViewActivityProxy.a.e(r5)     // Catch: java.lang.Throwable -> L73
            r1.putExtra(r0, r2)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "key_show_tk_confirm_dialog"
            boolean r2 = r5.qU()     // Catch: java.lang.Throwable -> L73
            r1.putExtra(r0, r2)     // Catch: java.lang.Throwable -> L73
            com.kwad.sdk.core.response.model.AdResultData r0 = com.kwad.components.core.page.AdWebViewActivityProxy.a.f(r5)     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L75
            com.kwad.sdk.core.response.model.AdTemplate r0 = com.kwad.components.core.page.AdWebViewActivityProxy.a.g(r5)     // Catch: java.lang.Throwable -> L73
            com.kwad.sdk.core.response.model.AdResultData r0 = com.kwad.sdk.core.response.b.c.dW(r0)     // Catch: java.lang.Throwable -> L73
            goto L75
        L73:
            r4 = move-exception
            goto L86
        L75:
            com.kwad.components.core.c.f r2 = com.kwad.components.core.c.f.ol()     // Catch: java.lang.Throwable -> L73
            int r0 = r2.l(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = "key_ad_result_cache_idx"
            r1.putExtra(r2, r0)     // Catch: java.lang.Throwable -> L73
            r4.startActivity(r1)     // Catch: java.lang.Throwable -> L73
            return
        L86:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r4)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.getAdTemplate()
            int r1 = r5.qS()
            java.lang.String r5 = r5.qR()
            java.lang.String r2 = com.kwad.sdk.utils.bw.s(r4)
            com.kwad.sdk.commercial.g.a.a(r0, r1, r5, r2)
            com.kwad.sdk.l r5 = com.kwad.sdk.l.Cf()
            boolean r5 = r5.Bk()
            if (r5 == 0) goto Laa
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r4)
            return
        Laa:
            throw r4
        Lab:
            return
    }

    public static void launch(android.content.Context r2, com.kwad.sdk.core.response.model.AdTemplate r3) {
            com.kwad.components.core.page.AdWebViewActivityProxy$a$a r0 = new com.kwad.components.core.page.AdWebViewActivityProxy$a$a
            r0.<init>()
            java.lang.String r1 = com.kwad.sdk.core.response.b.b.cN(r3)
            com.kwad.components.core.page.AdWebViewActivityProxy$a$a r0 = r0.aA(r1)
            com.kwad.components.core.page.AdWebViewActivityProxy$a$a r3 = r0.aD(r3)
            com.kwad.components.core.page.AdWebViewActivityProxy$a r3 = r3.qW()
            launch(r2, r3)
            return
    }

    @com.ksad.annotation.invoker.InvokeBy(invokerClass = com.kwad.sdk.service.c.class, methodId = "initComponentProxyForInvoker")
    public static void register() {
            java.lang.Class<com.kwad.sdk.api.proxy.app.AdWebViewActivity> r0 = com.kwad.sdk.api.proxy.app.AdWebViewActivity.class
            java.lang.Class<com.kwad.components.core.page.AdWebViewActivityProxy> r1 = com.kwad.components.core.page.AdWebViewActivityProxy.class
            com.kwad.sdk.service.c.a(r0, r1)
            return
    }

    private void showDialog() {
            r3 = this;
            android.app.Dialog r0 = r3.mKsExitInterceptDialog
            if (r0 != 0) goto La
            com.kwad.components.core.page.widget.a r0 = r3.buildDialog()
            r3.mKsExitInterceptDialog = r0
        La:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            r1 = 103(0x67, float:1.44E-43)
            r2 = 0
            com.kwad.sdk.core.adlog.c.b(r0, r1, r2)
            android.app.Dialog r0 = r3.mKsExitInterceptDialog
            r0.show()
            return
    }

    @Override // com.kwad.components.core.proxy.f
    public boolean checkIntentData(@androidx.annotation.Nullable android.content.Intent r4) {
            r3 = this;
            android.content.Intent r4 = r3.getIntent()
            java.lang.String r0 = "key_ad_result_cache_idx"
            r1 = 0
            int r4 = r4.getIntExtra(r0, r1)
            com.kwad.components.core.c.f r0 = com.kwad.components.core.c.f.ol()
            r2 = 1
            com.kwad.sdk.core.response.model.AdResultData r4 = r0.d(r4, r2)
            r3.mAdResultData = r4
            if (r4 != 0) goto L19
            return r1
        L19:
            com.kwad.sdk.core.response.model.AdTemplate r4 = com.kwad.sdk.core.response.b.c.r(r4)
            r3.mAdTemplate = r4
            if (r4 == 0) goto L22
            return r2
        L22:
            return r1
    }

    @Override // com.kwad.components.core.proxy.f
    public int getLayoutId() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.core.proxy.f
    public java.lang.String getPageName() {
            r1 = this;
            java.lang.String r0 = "AdWebViewActivityProxy"
            return r0
    }

    @Override // com.kwad.components.core.proxy.f
    public void initData() {
            r3 = this;
            r0 = 0
            r3.destroyed = r0
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r2 = "key_page_title"
            java.lang.String r1 = r1.getStringExtra(r2)
            r3.mPageTitle = r1
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r2 = "key_landing_page_type"
            int r1 = r1.getIntExtra(r2, r0)
            r3.mLandingPageType = r1
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r2 = "key_page_url"
            java.lang.String r1 = r1.getStringExtra(r2)
            r3.mPageUrl = r1
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r2 = "key_is_auto_show"
            boolean r1 = r1.getBooleanExtra(r2, r0)
            r3.mAutoShow = r1
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r2 = "key_show_permission"
            boolean r1 = r1.getBooleanExtra(r2, r0)
            r3.mShowPermission = r1
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r2 = "key_show_tk_confirm_dialog"
            boolean r0 = r1.getBooleanExtra(r2, r0)
            r3.mDisableShowConfirmDialog = r0
            return
    }

    @Override // com.kwad.components.core.proxy.f
    public void initView() {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_activity_landpage
            r1.setContentView(r0)
            r1.initContentView()
            return
    }

    @Override // com.kwad.components.core.proxy.f
    public void onActivityCreate() {
            r3 = this;
            super.onActivityCreate()
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            int r1 = r3.mLandingPageType
            java.lang.String r2 = r3.mPageUrl
            com.kwad.sdk.commercial.g.a.k(r0, r1, r2)
            return
    }

    @Override // com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onBackPressed() {
            r3 = this;
            com.kwad.components.core.page.c r0 = r3.mLandingPageView
            if (r0 == 0) goto L10
            boolean r0 = r0.getCanInterceptBackClick()
            if (r0 == 0) goto L10
            com.kwad.components.core.page.c r0 = r3.mLandingPageView
            r0.qY()
            return
        L10:
            boolean r0 = r3.mDisableShowConfirmDialog
            if (r0 == 0) goto L18
            r3.finish()
            return
        L18:
            boolean r0 = r3.handleMiddlePageDialog()
            if (r0 == 0) goto L1f
            return
        L1f:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            if (r0 == 0) goto La9
            boolean r1 = r0.mIsForceJumpLandingPage
            if (r1 == 0) goto L29
            goto La9
        L29:
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.sdk.core.response.b.a.aO(r0)
            if (r0 == 0) goto L77
            com.kwad.components.core.r.a r0 = com.kwad.components.core.r.a.sF()
            int r0 = r0.sG()
            r1 = 1
            if (r0 != r1) goto L77
            com.kwad.components.core.r.a r0 = com.kwad.components.core.r.a.sF()
            boolean r0 = r0.sL()
            if (r0 == 0) goto L77
            com.kwad.components.core.r.a r0 = com.kwad.components.core.r.a.sF()
            boolean r0 = r0.sI()
            if (r0 != 0) goto L77
            com.kwad.components.core.r.a r0 = com.kwad.components.core.r.a.sF()
            boolean r0 = r0.sH()
            if (r0 != 0) goto L73
            boolean r0 = com.kwad.sdk.core.config.e.Fq()
            if (r0 != 0) goto L63
            goto L73
        L63:
            com.kwad.components.core.r.b r0 = r3.getTkDialogFragment()
            r3.mDialogFragment = r0
            android.app.Activity r1 = r3.getActivity()
            com.kwad.components.core.webview.tachikoma.f.c r2 = r3.mBaseDialogListener
            com.kwad.components.core.r.b.a(r0, r1, r2)
            return
        L73:
            super.onBackPressed()
            return
        L77:
            boolean r0 = r3.isFormAdExitInterceptEnable()
            if (r0 == 0) goto La5
            android.app.Dialog r0 = r3.mKsExitInterceptDialogV2     // Catch: java.lang.Throwable -> L92
            if (r0 != 0) goto L94
            com.kwad.components.core.page.widget.a r0 = new com.kwad.components.core.page.widget.a     // Catch: java.lang.Throwable -> L92
            android.app.Activity r1 = r3.getActivity()     // Catch: java.lang.Throwable -> L92
            com.kwad.components.core.page.AdWebViewActivityProxy$4 r2 = new com.kwad.components.core.page.AdWebViewActivityProxy$4     // Catch: java.lang.Throwable -> L92
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L92
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L92
            r3.mKsExitInterceptDialogV2 = r0     // Catch: java.lang.Throwable -> L92
            goto L94
        L92:
            r0 = move-exception
            goto La2
        L94:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate     // Catch: java.lang.Throwable -> L92
            r1 = 103(0x67, float:1.44E-43)
            r2 = 0
            com.kwad.sdk.core.adlog.c.b(r0, r1, r2)     // Catch: java.lang.Throwable -> L92
            android.app.Dialog r0 = r3.mKsExitInterceptDialogV2     // Catch: java.lang.Throwable -> L92
            r0.show()     // Catch: java.lang.Throwable -> L92
            return
        La2:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
        La5:
            super.onBackPressed()
            return
        La9:
            super.onBackPressed()
            return
    }

    @Override // com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onDestroy() {
            r2 = this;
            r0 = 1
            r2.destroyed = r0     // Catch: java.lang.Throwable -> L37
            com.kwad.components.core.r.b r0 = r2.mDialogFragment     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto Ld
            r0.dismiss()     // Catch: java.lang.Throwable -> L37
            r0 = 0
            r2.mDialogFragment = r0     // Catch: java.lang.Throwable -> L37
        Ld:
            android.app.Dialog r0 = r2.mKsExitInterceptDialog     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L1c
            boolean r0 = r0.isShowing()     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L1c
            android.app.Dialog r0 = r2.mKsExitInterceptDialog     // Catch: java.lang.Throwable -> L37
            r0.dismiss()     // Catch: java.lang.Throwable -> L37
        L1c:
            android.app.Dialog r0 = r2.mKsExitInterceptDialogV2     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L2b
            boolean r0 = r0.isShowing()     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L2b
            android.app.Dialog r0 = r2.mKsExitInterceptDialogV2     // Catch: java.lang.Throwable -> L37
            r0.dismiss()     // Catch: java.lang.Throwable -> L37
        L2b:
            super.onDestroy()     // Catch: java.lang.Throwable -> L37
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L37
            r1 = 0
            r0.interactLandingPageShowing = r1     // Catch: java.lang.Throwable -> L37
            r0.mIsForceJumpLandingPage = r1     // Catch: java.lang.Throwable -> L37
        L37:
            return
    }

    @Override // com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onPause() {
            r1 = this;
            super.onPause()
            r0 = 0
            r1.overridePendingTransition(r0, r0)
            return
    }

    @Override // com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onPreCreate(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            super.onPreCreate(r2)
            android.content.Intent r2 = r1.getIntent()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r0 = "key_template"
            r2.removeExtra(r0)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    @Override // com.kwad.components.core.proxy.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onResume() {
            r0 = this;
            super.onResume()
            return
    }
}
