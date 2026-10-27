package xyz.adscope.amps.config;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSRequestParameters {
    private int adCount;
    private java.util.Map<java.lang.String, java.lang.Object> customExtraParameters;
    private java.lang.String extraData;
    private int height;
    private java.lang.String jsonObject;
    private java.lang.String loadType;
    private java.lang.String spaceId;
    private int timeOut;
    private java.lang.String userId;
    private int width;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        private int adCount;
        private java.util.Map<java.lang.String, java.lang.Object> customExtraParameters;
        private java.lang.String extraData;
        private int height;
        private java.lang.String spaceId;
        private int timeOut;
        private java.lang.String userId;
        private int width;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 5000(0x1388, float:7.006E-42)
                r1.timeOut = r0
                r0 = 1
                r1.adCount = r0
                return
        }

        public xyz.adscope.amps.config.AMPSRequestParameters build() {
                r2 = this;
                xyz.adscope.amps.config.AMPSRequestParameters r0 = new xyz.adscope.amps.config.AMPSRequestParameters
                r0.<init>()
                java.lang.String r1 = r2.spaceId
                r0.setSpaceId(r1)
                int r1 = r2.width
                r0.setWidth(r1)
                int r1 = r2.height
                r0.setHeight(r1)
                java.lang.String r1 = r2.userId
                r0.setUserId(r1)
                java.lang.String r1 = r2.extraData
                r0.setExtraData(r1)
                int r1 = r2.timeOut
                r0.setTimeOut(r1)
                int r1 = r2.adCount
                r0.setAdCount(r1)
                java.util.Map<java.lang.String, java.lang.Object> r1 = r2.customExtraParameters
                r0.setCustomExtraParameters(r1)
                return r0
        }

        public xyz.adscope.amps.config.AMPSRequestParameters.Builder setAdCount(int r1) {
                r0 = this;
                r0.adCount = r1
                return r0
        }

        public xyz.adscope.amps.config.AMPSRequestParameters.Builder setCustomExtraParameters(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                r0.customExtraParameters = r1
                return r0
        }

        public xyz.adscope.amps.config.AMPSRequestParameters.Builder setExtraData(java.lang.String r1) {
                r0 = this;
                r0.extraData = r1
                return r0
        }

        public xyz.adscope.amps.config.AMPSRequestParameters.Builder setHeight(int r1) {
                r0 = this;
                r0.height = r1
                return r0
        }

        public xyz.adscope.amps.config.AMPSRequestParameters.Builder setSpaceId(java.lang.String r1) {
                r0 = this;
                r0.spaceId = r1
                return r0
        }

        public xyz.adscope.amps.config.AMPSRequestParameters.Builder setTimeOut(int r1) {
                r0 = this;
                r0.timeOut = r1
                return r0
        }

        public xyz.adscope.amps.config.AMPSRequestParameters.Builder setUserId(java.lang.String r1) {
                r0 = this;
                r0.userId = r1
                return r0
        }

        public xyz.adscope.amps.config.AMPSRequestParameters.Builder setWidth(int r1) {
                r0 = this;
                r0.width = r1
                return r0
        }
    }

    public AMPSRequestParameters() {
            r0 = this;
            r0.<init>()
            return
    }

    public int getAdCount() {
            r1 = this;
            int r0 = r1.adCount
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> getCustomExtraParameters() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.customExtraParameters
            return r0
    }

    public java.lang.String getExtraData() {
            r1 = this;
            java.lang.String r0 = r1.extraData
            return r0
    }

    public int getHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    public java.lang.String getJsonObject() {
            r1 = this;
            java.lang.String r0 = r1.jsonObject
            return r0
    }

    public java.lang.String getLoadType() {
            r1 = this;
            java.lang.String r0 = r1.loadType
            return r0
    }

    public java.lang.String getSpaceId() {
            r1 = this;
            java.lang.String r0 = r1.spaceId
            return r0
    }

    public int getTimeOut() {
            r1 = this;
            int r0 = r1.timeOut
            return r0
    }

    public java.lang.String getUserId() {
            r1 = this;
            java.lang.String r0 = r1.userId
            return r0
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }

    public void setAdCount(int r1) {
            r0 = this;
            r0.adCount = r1
            return
    }

    public void setCustomExtraParameters(java.util.Map<java.lang.String, java.lang.Object> r1) {
            r0 = this;
            r0.customExtraParameters = r1
            return
    }

    public void setExtraData(java.lang.String r1) {
            r0 = this;
            r0.extraData = r1
            return
    }

    public void setHeight(int r1) {
            r0 = this;
            r0.height = r1
            return
    }

    public void setJsonObject(java.lang.String r1) {
            r0 = this;
            r0.jsonObject = r1
            return
    }

    public void setLoadType(java.lang.String r1) {
            r0 = this;
            r0.loadType = r1
            return
    }

    public void setSpaceId(java.lang.String r1) {
            r0 = this;
            r0.spaceId = r1
            return
    }

    public void setTimeOut(int r1) {
            r0 = this;
            r0.timeOut = r1
            return
    }

    public void setUserId(java.lang.String r1) {
            r0 = this;
            r0.userId = r1
            return
    }

    public void setWidth(int r1) {
            r0 = this;
            r0.width = r1
            return
    }
}
