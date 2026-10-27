package com.umeng.socialize.handler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class UMAPIShareHandler extends com.umeng.socialize.handler.UMSSOHandler implements com.umeng.socialize.editorpage.IEditor {
    private java.util.Stack<com.umeng.socialize.handler.UMAPIShareHandler.StatHolder> mStatStack;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class StatHolder {
        public com.umeng.socialize.ShareContent Content;
        private com.umeng.socialize.UMShareListener Listener;

        private StatHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ StatHolder(com.umeng.socialize.handler.UMAPIShareHandler.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.umeng.socialize.UMShareListener access$000(com.umeng.socialize.handler.UMAPIShareHandler.StatHolder r0) {
                com.umeng.socialize.UMShareListener r0 = r0.Listener
                return r0
        }

        static /* synthetic */ com.umeng.socialize.UMShareListener access$002(com.umeng.socialize.handler.UMAPIShareHandler.StatHolder r0, com.umeng.socialize.UMShareListener r1) {
                r0.Listener = r1
                return r1
        }
    }

    public UMAPIShareHandler() {
            r1 = this;
            r1.<init>()
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r1.mStatStack = r0
            return
    }

    public abstract void authorizeCallBack(int r1, int r2, android.content.Intent r3);

    public abstract void deleteAuth();

    protected void doShare(com.umeng.socialize.ShareContent r4, com.umeng.socialize.UMShareListener r5) {
            r3 = this;
            com.umeng.socialize.UMShareConfig r0 = r3.getShareConfig()
            boolean r0 = r0.isOpenShareEditActivity()
            if (r0 == 0) goto L64
            com.umeng.socialize.handler.UMAPIShareHandler$StatHolder r0 = new com.umeng.socialize.handler.UMAPIShareHandler$StatHolder
            r1 = 0
            r0.<init>(r1)
            r0.Content = r4
            com.umeng.socialize.handler.UMAPIShareHandler.StatHolder.access$002(r0, r5)
            java.util.Stack<com.umeng.socialize.handler.UMAPIShareHandler$StatHolder> r1 = r3.mStatStack
            r1.push(r0)
            java.lang.ref.WeakReference<android.app.Activity> r0 = r3.mWeakAct
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L63
            java.lang.ref.WeakReference<android.app.Activity> r0 = r3.mWeakAct
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L63
            java.lang.String r0 = "com.umeng.socialize.editorpage.ShareActivity"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L5a
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.ClassNotFoundException -> L5a
            java.lang.ref.WeakReference<android.app.Activity> r2 = r3.mWeakAct     // Catch: java.lang.ClassNotFoundException -> L5a
            java.lang.Object r2 = r2.get()     // Catch: java.lang.ClassNotFoundException -> L5a
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.ClassNotFoundException -> L5a
            r1.<init>(r2, r0)     // Catch: java.lang.ClassNotFoundException -> L5a
            android.os.Bundle r0 = r3.getEditable(r4)     // Catch: java.lang.ClassNotFoundException -> L5a
            r1.putExtras(r0)     // Catch: java.lang.ClassNotFoundException -> L5a
            java.lang.ref.WeakReference<android.app.Activity> r0 = r3.mWeakAct     // Catch: java.lang.ClassNotFoundException -> L5a
            java.lang.Object r0 = r0.get()     // Catch: java.lang.ClassNotFoundException -> L5a
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.ClassNotFoundException -> L5a
            int r2 = r3.getRequestCode()     // Catch: java.lang.ClassNotFoundException -> L5a
            r0.startActivityForResult(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L5a
            goto L63
        L5a:
            r0 = move-exception
            r3.sendShareRequest(r4, r5)
            java.lang.String r4 = com.umeng.socialize.utils.UmengText.INTER.NULLJAR
            com.umeng.socialize.utils.SLog.error(r4, r0)
        L63:
            return
        L64:
            r3.sendShareRequest(r4, r5)
            return
    }

    public abstract com.umeng.socialize.bean.SHARE_MEDIA getPlatform();

    public abstract java.lang.String getUID();

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            int r0 = r1.getRequestCode()
            if (r2 == r0) goto L7
            goto L65
        L7:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r3 != r0) goto L29
            java.util.Stack<com.umeng.socialize.handler.UMAPIShareHandler$StatHolder> r2 = r1.mStatStack
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L65
            java.util.Stack<com.umeng.socialize.handler.UMAPIShareHandler$StatHolder> r2 = r1.mStatStack
            java.lang.Object r2 = r2.pop()
            com.umeng.socialize.handler.UMAPIShareHandler$StatHolder r2 = (com.umeng.socialize.handler.UMAPIShareHandler.StatHolder) r2
            if (r2 == 0) goto L65
            com.umeng.socialize.UMShareListener r2 = com.umeng.socialize.handler.UMAPIShareHandler.StatHolder.access$000(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r3 = r1.getPlatform()
            r2.onCancel(r3)
            return
        L29:
            if (r4 == 0) goto L66
            java.lang.String r0 = "txt"
            boolean r0 = r4.hasExtra(r0)
            if (r0 == 0) goto L66
            java.util.Stack<com.umeng.socialize.handler.UMAPIShareHandler$StatHolder> r2 = r1.mStatStack
            boolean r2 = r2.empty()
            if (r2 != 0) goto L65
            java.util.Stack<com.umeng.socialize.handler.UMAPIShareHandler$StatHolder> r2 = r1.mStatStack
            java.lang.Object r2 = r2.pop()
            com.umeng.socialize.handler.UMAPIShareHandler$StatHolder r2 = (com.umeng.socialize.handler.UMAPIShareHandler.StatHolder) r2
            android.os.Bundle r4 = r4.getExtras()
            r0 = -1
            if (r3 != r0) goto L54
            com.umeng.socialize.handler.UMAPIShareHandler$1 r3 = new com.umeng.socialize.handler.UMAPIShareHandler$1
            r3.<init>(r1, r2, r4)
            r2 = 1
            com.umeng.socialize.common.QueuedWork.runInBack(r3, r2)
            return
        L54:
            com.umeng.socialize.UMShareListener r3 = com.umeng.socialize.handler.UMAPIShareHandler.StatHolder.access$000(r2)
            if (r3 == 0) goto L65
            com.umeng.socialize.UMShareListener r2 = com.umeng.socialize.handler.UMAPIShareHandler.StatHolder.access$000(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r3 = r1.getPlatform()
            r2.onCancel(r3)
        L65:
            return
        L66:
            r1.authorizeCallBack(r2, r3, r4)
            return
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void onCreate(android.content.Context r1, com.umeng.socialize.PlatformConfig.Platform r2) {
            r0 = this;
            super.onCreate(r1, r2)
            return
    }

    public void sendShareRequest(com.umeng.socialize.ShareContent r8, com.umeng.socialize.UMShareListener r9) {
            r7 = this;
            com.umeng.socialize.bean.SHARE_MEDIA r5 = r7.getPlatform()
            java.lang.String r0 = r5.toString()
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = r7.getUID()
            com.umeng.socialize.net.analytics.AnalyticsReqeust r2 = new com.umeng.socialize.net.analytics.AnalyticsReqeust
            android.content.Context r3 = r7.getContext()
            java.lang.String r4 = r8.mText
            r2.<init>(r3, r0, r4)
            com.umeng.socialize.media.UMediaObject r0 = r8.mMedia
            r2.setMedia(r0)
            r2.setmUsid(r1)
            r0 = 0
            r2.setReqType(r0)
            com.umeng.socialize.net.analytics.AnalyticsResponse r2 = com.umeng.socialize.net.RestAPI.doShareByRequest(r2)
            if (r2 != 0) goto L36
            com.umeng.socialize.handler.UMAPIShareHandler$3 r8 = new com.umeng.socialize.handler.UMAPIShareHandler$3
            r8.<init>(r7, r9, r5)
            com.umeng.socialize.common.QueuedWork.runInMain(r8)
            return
        L36:
            boolean r0 = r2.isOk()
            if (r0 != 0) goto L49
            com.umeng.socialize.handler.UMAPIShareHandler$4 r0 = new com.umeng.socialize.handler.UMAPIShareHandler$4
            r6 = r2
            r1 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.umeng.socialize.common.QueuedWork.runInMain(r0)
            return
        L49:
            r1 = r7
            r4 = r9
            com.umeng.socialize.handler.UMAPIShareHandler$5 r8 = new com.umeng.socialize.handler.UMAPIShareHandler$5
            r8.<init>(r7, r4, r5)
            com.umeng.socialize.common.QueuedWork.runInMain(r8)
            return
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean share(com.umeng.socialize.ShareContent r2, com.umeng.socialize.UMShareListener r3) {
            r1 = this;
            boolean r0 = r1.isAuthorize()
            if (r0 == 0) goto La
            r1.doShare(r2, r3)
            goto L12
        La:
            com.umeng.socialize.handler.UMAPIShareHandler$2 r0 = new com.umeng.socialize.handler.UMAPIShareHandler$2
            r0.<init>(r1, r3, r2)
            r1.authorize(r0)
        L12:
            r2 = 0
            return r2
    }
}
