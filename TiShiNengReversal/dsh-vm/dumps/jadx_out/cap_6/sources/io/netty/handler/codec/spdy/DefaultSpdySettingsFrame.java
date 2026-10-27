package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultSpdySettingsFrame implements io.netty.handler.codec.spdy.SpdySettingsFrame {
    private boolean clear;
    private final java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.DefaultSpdySettingsFrame.Setting> settingsMap;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Setting {
        private boolean persist;
        private boolean persisted;
        private int value;

        Setting(int r1, boolean r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                r0.persist = r2
                r0.persisted = r3
                return
        }

        int getValue() {
                r1 = this;
                int r0 = r1.value
                return r0
        }

        boolean isPersist() {
                r1 = this;
                boolean r0 = r1.persist
                return r0
        }

        boolean isPersisted() {
                r1 = this;
                boolean r0 = r1.persisted
                return r0
        }

        void setPersist(boolean r1) {
                r0 = this;
                r0.persist = r1
                return
        }

        void setPersisted(boolean r1) {
                r0 = this;
                r0.persisted = r1
                return
        }

        void setValue(int r1) {
                r0 = this;
                r0.value = r1
                return
        }
    }

    public DefaultSpdySettingsFrame() {
            r1 = this;
            r1.<init>()
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r1.settingsMap = r0
            return
    }

    private void appendSettings(java.lang.StringBuilder r5) {
            r4 = this;
            java.util.Set r0 = r4.getSettings()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L55
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            io.netty.handler.codec.spdy.DefaultSpdySettingsFrame$Setting r2 = (io.netty.handler.codec.spdy.DefaultSpdySettingsFrame.Setting) r2
            java.lang.String r3 = "--> "
            r5.append(r3)
            java.lang.Object r1 = r1.getKey()
            r5.append(r1)
            r1 = 58
            r5.append(r1)
            int r1 = r2.getValue()
            r5.append(r1)
            java.lang.String r1 = " (persist value: "
            r5.append(r1)
            boolean r1 = r2.isPersist()
            r5.append(r1)
            java.lang.String r1 = "; persisted: "
            r5.append(r1)
            boolean r1 = r2.isPersisted()
            r5.append(r1)
            r1 = 41
            r5.append(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.NEWLINE
            r5.append(r1)
            goto L8
        L55:
            return
    }

    private java.util.Set<java.util.Map.Entry<java.lang.Integer, io.netty.handler.codec.spdy.DefaultSpdySettingsFrame.Setting>> getSettings() {
            r1 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.DefaultSpdySettingsFrame$Setting> r0 = r1.settingsMap
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdySettingsFrame
    public boolean clearPreviouslyPersistedSettings() {
            r1 = this;
            boolean r0 = r1.clear
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdySettingsFrame
    public int getValue(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.DefaultSpdySettingsFrame$Setting> r0 = r1.settingsMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.spdy.DefaultSpdySettingsFrame$Setting r2 = (io.netty.handler.codec.spdy.DefaultSpdySettingsFrame.Setting) r2
            if (r2 == 0) goto L13
            int r2 = r2.getValue()
            return r2
        L13:
            r2 = -1
            return r2
    }

    @Override // io.netty.handler.codec.spdy.SpdySettingsFrame
    public java.util.Set<java.lang.Integer> ids() {
            r1 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.DefaultSpdySettingsFrame$Setting> r0 = r1.settingsMap
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdySettingsFrame
    public boolean isPersistValue(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.DefaultSpdySettingsFrame$Setting> r0 = r1.settingsMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.spdy.DefaultSpdySettingsFrame$Setting r2 = (io.netty.handler.codec.spdy.DefaultSpdySettingsFrame.Setting) r2
            if (r2 == 0) goto L16
            boolean r2 = r2.isPersist()
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    @Override // io.netty.handler.codec.spdy.SpdySettingsFrame
    public boolean isPersisted(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.DefaultSpdySettingsFrame$Setting> r0 = r1.settingsMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.spdy.DefaultSpdySettingsFrame$Setting r2 = (io.netty.handler.codec.spdy.DefaultSpdySettingsFrame.Setting) r2
            if (r2 == 0) goto L16
            boolean r2 = r2.isPersisted()
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    @Override // io.netty.handler.codec.spdy.SpdySettingsFrame
    public boolean isSet(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.DefaultSpdySettingsFrame$Setting> r0 = r1.settingsMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // io.netty.handler.codec.spdy.SpdySettingsFrame
    public io.netty.handler.codec.spdy.SpdySettingsFrame removeValue(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.DefaultSpdySettingsFrame$Setting> r0 = r1.settingsMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
            return r1
    }

    @Override // io.netty.handler.codec.spdy.SpdySettingsFrame
    public io.netty.handler.codec.spdy.SpdySettingsFrame setClearPreviouslyPersistedSettings(boolean r1) {
            r0 = this;
            r0.clear = r1
            return r0
    }

    @Override // io.netty.handler.codec.spdy.SpdySettingsFrame
    public io.netty.handler.codec.spdy.SpdySettingsFrame setPersistValue(int r2, boolean r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.DefaultSpdySettingsFrame$Setting> r0 = r1.settingsMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.spdy.DefaultSpdySettingsFrame$Setting r2 = (io.netty.handler.codec.spdy.DefaultSpdySettingsFrame.Setting) r2
            if (r2 == 0) goto L11
            r2.setPersist(r3)
        L11:
            return r1
    }

    @Override // io.netty.handler.codec.spdy.SpdySettingsFrame
    public io.netty.handler.codec.spdy.SpdySettingsFrame setPersisted(int r2, boolean r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.DefaultSpdySettingsFrame$Setting> r0 = r1.settingsMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.codec.spdy.DefaultSpdySettingsFrame$Setting r2 = (io.netty.handler.codec.spdy.DefaultSpdySettingsFrame.Setting) r2
            if (r2 == 0) goto L11
            r2.setPersisted(r3)
        L11:
            return r1
    }

    @Override // io.netty.handler.codec.spdy.SpdySettingsFrame
    public io.netty.handler.codec.spdy.SpdySettingsFrame setValue(int r2, int r3) {
            r1 = this;
            r0 = 0
            io.netty.handler.codec.spdy.SpdySettingsFrame r2 = r1.setValue(r2, r3, r0, r0)
            return r2
    }

    @Override // io.netty.handler.codec.spdy.SpdySettingsFrame
    public io.netty.handler.codec.spdy.SpdySettingsFrame setValue(int r3, int r4, boolean r5, boolean r6) {
            r2 = this;
            if (r3 < 0) goto L2a
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r3 > r0) goto L2a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.DefaultSpdySettingsFrame$Setting> r0 = r2.settingsMap
            java.lang.Object r0 = r0.get(r3)
            io.netty.handler.codec.spdy.DefaultSpdySettingsFrame$Setting r0 = (io.netty.handler.codec.spdy.DefaultSpdySettingsFrame.Setting) r0
            if (r0 == 0) goto L1f
            r0.setValue(r4)
            r0.setPersist(r5)
            r0.setPersisted(r6)
            return r2
        L1f:
            java.util.Map<java.lang.Integer, io.netty.handler.codec.spdy.DefaultSpdySettingsFrame$Setting> r0 = r2.settingsMap
            io.netty.handler.codec.spdy.DefaultSpdySettingsFrame$Setting r1 = new io.netty.handler.codec.spdy.DefaultSpdySettingsFrame$Setting
            r1.<init>(r4, r5, r6)
            r0.put(r3, r1)
            return r2
        L2a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Setting ID is not valid: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.append(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.NEWLINE
            r0.append(r1)
            r3.appendSettings(r0)
            int r2 = r0.length()
            int r1 = r1.length()
            int r2 = r2 - r1
            r0.setLength(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
