package eu.cryptoeuro.rest.model;

import lombok.Data;
import lombok.NonNull;
import eu.cryptoeuro.FeeConstant;

@Data
public class Fee {

    @NonNull
    public Long amount = FeeConstant.FEE;

}
