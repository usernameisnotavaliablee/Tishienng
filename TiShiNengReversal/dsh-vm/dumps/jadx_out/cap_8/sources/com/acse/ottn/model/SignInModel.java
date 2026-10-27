package com.acse.ottn.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SignInModel {
    private java.lang.String points;
    private int r;
    private java.util.List<com.acse.ottn.model.SignInModel.SignBean> sign;
    private int sign_in;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class SignBean {
        private java.lang.String day;
        private java.lang.String points;
        private int sign;

        public SignBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String getDay() {
                r1 = this;
                java.lang.String r0 = r1.day
                return r0
        }

        public java.lang.String getPoints() {
                r1 = this;
                java.lang.String r0 = r1.points
                return r0
        }

        public int getSign() {
                r1 = this;
                int r0 = r1.sign
                return r0
        }

        public void setDay(java.lang.String r1) {
                r0 = this;
                r0.day = r1
                return
        }

        public void setPoints(java.lang.String r1) {
                r0 = this;
                r0.points = r1
                return
        }

        public void setSign(int r1) {
                r0 = this;
                r0.sign = r1
                return
        }
    }

    public SignInModel() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.sign = r0
            return
    }

    public java.lang.String getPoints() {
            r1 = this;
            java.lang.String r0 = r1.points
            return r0
    }

    public int getR() {
            r1 = this;
            int r0 = r1.r
            return r0
    }

    public java.util.List<com.acse.ottn.model.SignInModel.SignBean> getSign() {
            r1 = this;
            java.util.List<com.acse.ottn.model.SignInModel$SignBean> r0 = r1.sign
            return r0
    }

    public int getSign_in() {
            r1 = this;
            int r0 = r1.sign_in
            return r0
    }

    public void setPoints(java.lang.String r1) {
            r0 = this;
            r0.points = r1
            return
    }

    public void setR(int r1) {
            r0 = this;
            r0.r = r1
            return
    }

    public void setSign(java.util.List<com.acse.ottn.model.SignInModel.SignBean> r1) {
            r0 = this;
            r0.sign = r1
            return
    }

    public void setSign_in(int r1) {
            r0 = this;
            r0.sign_in = r1
            return
    }
}
