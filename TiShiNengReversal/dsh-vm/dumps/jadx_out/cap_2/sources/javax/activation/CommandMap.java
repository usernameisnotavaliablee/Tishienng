package javax.activation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class CommandMap {
    private static javax.activation.CommandMap defaultCommandMap;

    static {
            return
    }

    public CommandMap() {
            r0 = this;
            r0.<init>()
            return
    }

    public static javax.activation.CommandMap getDefaultCommandMap() {
            javax.activation.CommandMap r0 = javax.activation.CommandMap.defaultCommandMap
            if (r0 != 0) goto Lb
            javax.activation.MailcapCommandMap r0 = new javax.activation.MailcapCommandMap
            r0.<init>()
            javax.activation.CommandMap.defaultCommandMap = r0
        Lb:
            javax.activation.CommandMap r0 = javax.activation.CommandMap.defaultCommandMap
            return r0
    }

    public static void setDefaultCommandMap(javax.activation.CommandMap r3) {
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 == 0) goto L1d
            r0.checkSetFactory()     // Catch: java.lang.SecurityException -> La
            goto L1d
        La:
            r0 = move-exception
            java.lang.Class<javax.activation.CommandMap> r1 = javax.activation.CommandMap.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Class r2 = r3.getClass()
            java.lang.ClassLoader r2 = r2.getClassLoader()
            if (r1 != r2) goto L1c
            goto L1d
        L1c:
            throw r0
        L1d:
            javax.activation.CommandMap.defaultCommandMap = r3
            return
    }

    public abstract javax.activation.DataContentHandler createDataContentHandler(java.lang.String r1);

    public javax.activation.DataContentHandler createDataContentHandler(java.lang.String r1, javax.activation.DataSource r2) {
            r0 = this;
            javax.activation.DataContentHandler r1 = r0.createDataContentHandler(r1)
            return r1
    }

    public abstract javax.activation.CommandInfo[] getAllCommands(java.lang.String r1);

    public javax.activation.CommandInfo[] getAllCommands(java.lang.String r1, javax.activation.DataSource r2) {
            r0 = this;
            javax.activation.CommandInfo[] r1 = r0.getAllCommands(r1)
            return r1
    }

    public abstract javax.activation.CommandInfo getCommand(java.lang.String r1, java.lang.String r2);

    public javax.activation.CommandInfo getCommand(java.lang.String r1, java.lang.String r2, javax.activation.DataSource r3) {
            r0 = this;
            javax.activation.CommandInfo r1 = r0.getCommand(r1, r2)
            return r1
    }

    public java.lang.String[] getMimeTypes() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract javax.activation.CommandInfo[] getPreferredCommands(java.lang.String r1);

    public javax.activation.CommandInfo[] getPreferredCommands(java.lang.String r1, javax.activation.DataSource r2) {
            r0 = this;
            javax.activation.CommandInfo[] r1 = r0.getPreferredCommands(r1)
            return r1
    }
}
