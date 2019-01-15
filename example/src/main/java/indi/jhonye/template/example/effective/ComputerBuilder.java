/**
 * jhonye Indi.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package indi.jhonye.template.example.effective;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jhonye
 * @version $Id: InstanceBuilder.java, v 0.1 2019-01-14 12:32 AM jhonye Exp $$
 */
@Getter
@Setter
public class ComputerBuilder {

    private Double cpu;

    private Long mem;

    private Long disk;

    private ComputerBuilder(ComputerBuilder.Builder builder) {
        this.setCpu(builder.getCpu());
        this.setMem(builder.getMem());
        this.setDisk(builder.getDisk());
    }

    @Getter
    @Setter
    public static class Builder {
        private Double cpu;
        private Long mem;

        private Long disk = 0L;

        private Boolean screen = false;

        public Builder(Double cpu, Long mem) {
            this.cpu = cpu;
            this.mem = mem;
        }

        public Builder disk(Long volume) {
            this.disk = volume;
            return this;
        }

        public Builder screen(Boolean use) {
            this.screen = use;
            return this;
        }

        public ComputerBuilder build() {
            return new ComputerBuilder(this);
        }

    }

    public static void main(String[] args) {
        ComputerBuilder computerBuilder = (new ComputerBuilder.Builder(4.0, 8L))
                .disk(5L)
                .screen(true)
                .build();
    }

}