package ir.freeland.spring.scopeadvance.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Service
public class RequestScopedService implements BaseService {
}
