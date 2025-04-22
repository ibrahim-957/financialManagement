package com.ibrahim.financeManagement.Core.Utilities.Mappers;

import org.modelmapper.ModelMapper;

public interface IModelMapperService {
    ModelMapper forRequest();
    ModelMapper forResponse();
}
