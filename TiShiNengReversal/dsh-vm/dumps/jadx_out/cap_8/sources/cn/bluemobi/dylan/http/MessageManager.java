package cn.bluemobi.dylan.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MessageManager {
    private static volatile cn.bluemobi.dylan.http.MessageManager messageManager;
    private java.lang.String errorMessage;
    private cn.bluemobi.dylan.http.MessageManager.MessageModel showMessageModel;
    private boolean useEnglishLanguage;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum MessageModel extends java.lang.Enum<cn.bluemobi.dylan.http.MessageManager.MessageModel> {
        private static final /* synthetic */ cn.bluemobi.dylan.http.MessageManager.MessageModel[] $VALUES = null;
        public static final cn.bluemobi.dylan.http.MessageManager.MessageModel All = null;
        public static final cn.bluemobi.dylan.http.MessageManager.MessageModel NO = null;
        public static final cn.bluemobi.dylan.http.MessageManager.MessageModel OTHER_STATUS = null;

        static {
                cn.bluemobi.dylan.http.MessageManager$MessageModel r0 = new cn.bluemobi.dylan.http.MessageManager$MessageModel
                java.lang.String r1 = "All"
                r2 = 0
                r0.<init>(r1, r2)
                cn.bluemobi.dylan.http.MessageManager.MessageModel.All = r0
                cn.bluemobi.dylan.http.MessageManager$MessageModel r1 = new cn.bluemobi.dylan.http.MessageManager$MessageModel
                java.lang.String r3 = "OTHER_STATUS"
                r4 = 1
                r1.<init>(r3, r4)
                cn.bluemobi.dylan.http.MessageManager.MessageModel.OTHER_STATUS = r1
                cn.bluemobi.dylan.http.MessageManager$MessageModel r3 = new cn.bluemobi.dylan.http.MessageManager$MessageModel
                java.lang.String r5 = "NO"
                r6 = 2
                r3.<init>(r5, r6)
                cn.bluemobi.dylan.http.MessageManager.MessageModel.NO = r3
                r5 = 3
                cn.bluemobi.dylan.http.MessageManager$MessageModel[] r5 = new cn.bluemobi.dylan.http.MessageManager.MessageModel[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                cn.bluemobi.dylan.http.MessageManager.MessageModel.$VALUES = r5
                return
        }

        MessageModel(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static cn.bluemobi.dylan.http.MessageManager.MessageModel valueOf(java.lang.String r1) {
                java.lang.Class<cn.bluemobi.dylan.http.MessageManager$MessageModel> r0 = cn.bluemobi.dylan.http.MessageManager.MessageModel.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                cn.bluemobi.dylan.http.MessageManager$MessageModel r1 = (cn.bluemobi.dylan.http.MessageManager.MessageModel) r1
                return r1
        }

        public static cn.bluemobi.dylan.http.MessageManager.MessageModel[] values() {
                cn.bluemobi.dylan.http.MessageManager$MessageModel[] r0 = cn.bluemobi.dylan.http.MessageManager.MessageModel.$VALUES
                java.lang.Object r0 = r0.clone()
                cn.bluemobi.dylan.http.MessageManager$MessageModel[] r0 = (cn.bluemobi.dylan.http.MessageManager.MessageModel[]) r0
                return r0
        }
    }

    static {
            return
    }

    private MessageManager() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.useEnglishLanguage = r0
            cn.bluemobi.dylan.http.MessageManager$MessageModel r0 = cn.bluemobi.dylan.http.MessageManager.MessageModel.OTHER_STATUS
            r1.showMessageModel = r0
            java.lang.String r0 = "网络繁忙"
            r1.errorMessage = r0
            return
    }

    public static cn.bluemobi.dylan.http.MessageManager getMessageManager() {
            cn.bluemobi.dylan.http.MessageManager r0 = cn.bluemobi.dylan.http.MessageManager.messageManager
            if (r0 != 0) goto L19
            java.lang.Class<cn.bluemobi.dylan.http.MessageManager> r0 = cn.bluemobi.dylan.http.MessageManager.class
            monitor-enter(r0)
            cn.bluemobi.dylan.http.MessageManager r1 = cn.bluemobi.dylan.http.MessageManager.messageManager     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            cn.bluemobi.dylan.http.MessageManager r1 = new cn.bluemobi.dylan.http.MessageManager     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            cn.bluemobi.dylan.http.MessageManager.messageManager = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            cn.bluemobi.dylan.http.MessageManager r0 = cn.bluemobi.dylan.http.MessageManager.messageManager
            return r0
    }

    public java.lang.String getErrorMessage() {
            r1 = this;
            java.lang.String r0 = r1.errorMessage
            return r0
    }

    public cn.bluemobi.dylan.http.MessageManager.MessageModel getShowMessageModel() {
            r1 = this;
            cn.bluemobi.dylan.http.MessageManager$MessageModel r0 = r1.showMessageModel
            return r0
    }

    public boolean isUseEnglishLanguage() {
            r1 = this;
            boolean r0 = r1.useEnglishLanguage
            return r0
    }

    public cn.bluemobi.dylan.http.MessageManager setErrorMessage(java.lang.String r1) {
            r0 = this;
            r0.errorMessage = r1
            return r0
    }

    public cn.bluemobi.dylan.http.MessageManager setShowMessageModel(cn.bluemobi.dylan.http.MessageManager.MessageModel r1) {
            r0 = this;
            r0.showMessageModel = r1
            cn.bluemobi.dylan.http.MessageManager r1 = cn.bluemobi.dylan.http.MessageManager.messageManager
            return r1
    }

    public cn.bluemobi.dylan.http.MessageManager setUseEnglishLanguage(boolean r1) {
            r0 = this;
            r0.useEnglishLanguage = r1
            cn.bluemobi.dylan.http.MessageManager r1 = cn.bluemobi.dylan.http.MessageManager.messageManager
            return r1
    }
}
