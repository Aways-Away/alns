package vrptw.alns.config;

/**
 * Created by LiuCui on 2020/12/7
 */
public enum ALNSCOnfiguration implements IALNSConfig {
    DEFAULT(5000,
            500,
            0.1D,
            20,
            5,
            1,
            0.99937D,
            0.05D,
            0.5D);

    private final int omega;
    private final int tau;
    private final double r_p;
    private final int sigma_1;
    private final int sigma_2;
    private final int sigma_3;
    private final double c;
    private final double delta;
    private final double big_omega;


    ALNSCOnfiguration(int omega, int tau, double r_p, int sigma_1, int sigma_2, int sigma_3, double c, double delta, double big_omega, int omega1, int tau1) {

        this.omega = omega;
        this.tau = tau;
        this.r_p = r_p;
        this.sigma_1 = sigma_1;
        this.sigma_2 = sigma_2;
        this.sigma_3 = sigma_3;
        this.c = c;
        this.delta = delta;
        this.big_omega = big_omega;
    }

    public int getOmega() {
        return this.omega;
    }

    public int getTau() {
        return this.tau;
    }

    public double getR_p() {
        return this.r_p;
    }

    public int getSigma_1() {
        return this.sigma_1;
    }

    public int getSigma_2() {
        return this.sigma_2;
    }

    public int getSigma_3() {
        return this.sigma_3;
    }

    public double getC() {
        return this.c;
    }

    public double getDelta() {
        return this.delta;
    }

    public double getBig_omega() {
        return this.big_omega;
    }
}